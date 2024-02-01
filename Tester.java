import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    private static int numSessions = 5;
    private static int[] top52;
    private static int[] top5;
    private static Seminar[][] seminarList1 = new Seminar[5][5];
    
    public static void main(String[] args){
        Schedule test1 = new Schedule();
        test1.readFile();
        /*for(int i = 0; i < numSessions; i++){
            test1.getRank();
            //test1.makeSchedule(i);
            //test1.assignSession(i);
        }*/
        for(int u = 0; u < 5; u++){
            top5 = test1.getRank();
            for(int y = 0; y < 18; y++){
                System.out.print(top5[y]);
                System.out.println("\n");
            } 
            top52 = test1.get5();
            for(int p = 0; p < 5; p++){
                System.out.println(top52[p]);
            }
            test1.makeSchedule(u);
            test1.assignSession(u);
        }
        
        for(int e = 0; e < 5; e++){
            for(int a = 0; a < 5; a++){
                System.out.println(test1.schedule[e][a]);
            }
            System.out.println("");
        }
        
        
        
        /*for(int t = 0; t < 5; t++){
            for(int u = 0; u < 5; u++){
                System.out.println(test1.returnSchedule()[t][u]);
            }
            System.out.println();
        }*/
        
    }
}
