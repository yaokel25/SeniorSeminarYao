import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    private static int numSessions = 5;
    private static int[] top5;
    public static void main(String[] args){
        Schedule test1 = new Schedule();
        test1.readFile();
        /*for(int i = 0; i < numSessions; i++){
            test1.getRank();
            //test1.makeSchedule(i);
            //test1.assignSession(i);
        }*/

        top5 = test1.getRank();
        for(int y = 0; y < 18; y++){
            System.out.print(top5[y]);
            System.out.println("\n");
        }
        /*for(int t = 0; t < 5; t++){
            for(int u = 0; u < 5; u++){
                System.out.println(test1.returnSchedule()[t][u]);
            }
            System.out.println();
        }*/
        
    }
}
