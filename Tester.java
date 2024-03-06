/** Keliang Yao
 * 2/03
 * Main/driver class 
 * it first scans the two data files SrSeminar.csv and SessionName.cvs with student and seminar information, then makes the 
 * schedule, prints out the master roster, roster by seminar/instructor, roster by room number, student schedule (searched up by name)
 */


import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    private static int numSessions = 5;
    
    public static void main(String[] args){//main methods-run methods in Schedule class and prints rosters
        Scanner scan = new Scanner(System.in);
        Schedule test1 = new Schedule();
        test1.readFile();
        for(int u = 0; u < numSessions; u++){//making schedule
            test1.getRank();
            test1.get5();//get top 5 available seminars
            test1.makeSchedule(u);
            test1.assignSession(u);
        }
        for(int e = 0; e < numSessions; e++){//prints out master roster
            for(int a = 0; a < numSessions; a++){
                System.out.println(test1.schedule[e][a]);
            }
            System.out.println("\n");
        }
        //System.out.println(test1.countConflicts());        
        //printing roster by seminar/instructor
        System.out.println("Enter seminar number to print roster: ");
        int seminarNum = scan.nextInt();
        scan.nextLine();
        test1.seminarRoster(seminarNum);
        
        //printing roster by room #
        System.out.println("Enter room number to print roster: ");
        int roomNum = scan.nextInt();
        scan.nextLine();
        test1.roomRoster(roomNum);
        
        //printing student schedule
        System.out.println("Enter student name to search: ");
        String studentName1 = scan.nextLine();
        test1.studentRoster(studentName1);
    }
}
