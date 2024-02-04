import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    private static int numSessions = 5;
    
    public static void main(String[] args){//main methods-run methods in Schedule class and prints rosters
        Scanner scan = new Scanner(System.in);
        Schedule test1 = new Schedule();
        test1.readFile();
        for(int u = 0; u < numSessions; u++){
            test1.getRank();
            test1.get5();
            test1.makeSchedule(u);
            test1.assignSession(u);
        }
        for(int e = 0; e < numSessions; e++){//prints out master roster
            for(int a = 0; a < numSessions; a++){
                System.out.println(test1.schedule[e][a]);
            }
            System.out.println("");
        }
        System.out.print(test1.checkConflicts());//checks num of conflicts
        
        //printing roster by seminar/instructor
        System.out.println("Enter seminar number to print roster: ");
        int seminarNum = scan.nextInt();
        String breakLine = scan.nextLine();
        System.out.print(test1.seminarRoster(seminarNum));
    }
}
