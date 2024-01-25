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
        
    }
}
