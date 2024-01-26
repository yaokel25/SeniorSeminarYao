import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    private static int numSessions = 5;
    public static void main(String[] args){
        Schedule test1 = new Schedule();
        test1.readFile();
        for(int i = 0; i < numSessions; i++){
            test1.getRank();
            test1.get5();
            test1.makeSchedule(i);
            test1.assignSession(i);
        }
        for(int t = 0; t < 5; t++){
            for(int u = 0; u < 5; u++){
                System.out.println(test1.returnSchedule()[t][u]);
            }
            System.out.println();
        }
        
    }
}
