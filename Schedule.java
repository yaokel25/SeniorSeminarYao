/** Keliang Yao
 * 2/03
 * This is the Schedule class it contains methods canAdd (checks if seminars have been run less than two times), readFile (loads seminar and student info onto ArrayLists seminarList and senior),
 * getRank (returns integer array where the index is the seminarID and the number stored is the num of votes for the seminar), get5 (returns integer array with top 5 seminar IDs that have run less than twice),
 * makeSchedule (assigns students to seminars based on their choices and array from get5, and students who didn't choose or didn't get their choice will be put into any available seminars starting with the most popular),
 * seminarRoster (prints roster based on the seminarID)
 * roomRoster (prints roster based on room number)
 * studentRoster (prints out student information and schedule based on student name)
 */

import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Schedule{
    private String email;
    private String name;
    private int choice1;
    private int choice2;
    private int choice3;
    private int choice4;
    private int choice5;
    private int numChoices = 5;
    private ArrayList<Student> senior = new ArrayList<Student>();
    private int[] rankChoice = new int[18];//all seminar IDs except 0 is no choice and 19 is already completed choice
    private int numSeminars = 20;//not 18 because no choice is 0 and 19 is already completed choice
    private int numRoom = 5;
    private int numStudents = 74;
    private int[] hold5 = new int[numRoom];
    private ArrayList<Seminar> seminarList = new ArrayList<Seminar>();
    public Seminar[][] schedule = new Seminar[5][5];//public because it needs to be printed in Tester
    private int[] numTimes = new int[18];
    private ArrayList<Student> copyList = new ArrayList<Student>();

    public boolean canAdd(int sessionID){//checks if session has already run twice (returns true its been run less than twice)
        if(numTimes[sessionID] >=2){
            return false;
        }
        return true;
    }

    public void readFile(){//reads SessionName(seminar info-instructor, id, etc) and populate ArrayList seminarList of seminar objects and SrSeminar (students and their choices) and populate ArrayList senior of student objects
        try {
            File myObj = new File("SrSeminar.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] myArray = data.split(",", 0);
            email = myArray[0];
            name = myArray[1];
            choice1 = Integer.parseInt(myArray[2]);
            choice2 = Integer.parseInt(myArray[3]);
            choice3 = Integer.parseInt(myArray[4]);
            choice4 = Integer.parseInt(myArray[5]);
            choice5 = Integer.parseInt(myArray[6]);
            Student student1 = new Student(email, name, choice1, choice2, choice3, choice4, choice5);
            senior.add(student1);
            copyList.add(student1);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File myObj = new File("SessionName.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] myArray = data.split(",", 0);
            String sessionName = myArray[0];
            int sessionID = Integer.parseInt(myArray[1]) - 1;//sessionIDs start at 0
            String instructor = myArray[2];
            Seminar seminar1 = new Seminar(sessionID, instructor, sessionName);
            seminarList.add(seminar1);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }//method readFile

    public int[] getRank(){//creates array of ints where the index is seminar ID and the int stored in index is num of students who chose the seminar in one of their choices 
        int holdChoice = 0;
        //initialize rankChoice array
        for(int i = 0; i < numSeminars - 2; i++){//numSeminars is including 0 (no choice) and 19 (already got choice) so I only want the real seminar ID, hence the -2
            rankChoice[i] = 0;
        }
        
        //tallying student choices
        for(Student s1: senior){
            for(int i = 0; i < numChoices; i++){
                if(s1.getChoice(i) != 0 && s1.getChoice(i) != 19){
                    holdChoice = s1.getChoice(i) - 1;
                    rankChoice[holdChoice] ++;
                }//if
            }//for
        }//for-49
        System.out.println("getRank");
        return rankChoice;
    }//method getRank
    
    public int[] get5(){//returns array of ints of top 5 choices from getRank()
        //make copy of rankChoice array
        int[] holdSeminar = new int[numSeminars - 2];//only 18 seminars (not including 0 and 19)
        for(int p = 0; p < numSeminars - 2; p++){//online 18 seminars (not including 0 and 19)
            holdSeminar[p] = rankChoice[p];
        }
        //get top 5 choices by doig bubble sort 5 times
        int holdIndex = 0;
        int holdNum = 0;
        for(int j = 0; j < numRoom; j++){
            for(int f = 0; f < numSeminars - 2; f++){//online 18 seminars (not including 0 and 19)
                if(holdSeminar[f] > holdNum){
                    holdIndex = f;
                    holdNum = holdSeminar[f];
                }//if
            }
            if(canAdd(holdIndex)){
                hold5[j] = holdIndex;
                numTimes[holdIndex] ++;
            }
            holdSeminar[holdIndex] = 0;//seminar choices already counted so it is set to 0
            holdIndex = 0;
            holdNum = 0;
        }
        return hold5;
    }//method get5

    
    public void makeSchedule(int session){//intializes schedule[][] (2-d array of Seminar objects) with the most popular seminars and set room numbers 
        for(int i = 0; i < numRoom; i++){
            schedule[session][i] = new Seminar(hold5[i] + 1, seminarList.get(i).getInstructor(), seminarList.get(i).getName());
            //schedule[session][i] = seminarList.get(hold5[i]);//didn't work-seminarList was being changed as schedule gets changed-used line 125 to initialize schedule instead
            schedule[session][i].setRoom(i +1);//set rooms for seminars-room numbers start at 1
            schedule[session][i].setSession(session + 1);//keeps track of which session the seminar is in (session is from 0-4 so to the +1 is to make it 1-5)
        }//for
    }//makeSchedule
    
    public void assignSession(int session){//assigns students to seminars in hold5 based on their choices and randomly puts them in seminars (most popular first) if they didn't choose or didn't get their choice
        //assigns students based on their choices
        for(int i = 0; i < numChoices; i++){
            for(int j = 0; j < numRoom; j++){
                for(int h = 0; h < numStudents; h++){
                    if(senior.get(h).getChoice(i) != 0 && senior.get(h).getChoice(i) != 19 && senior.get(h).getChoice(i) == (hold5[j]+1) && schedule[session][j].checkNum() && senior.get(h).getSeminar(session) == -1){
                        senior.get(h).setSeminar((hold5[j]+1), session);
                        senior.get(h).setChoice(i);
                        schedule[session][j].addStudent(senior.get(h));
                    }//if
                }//for
            }//for
        }//for
        //assign students who did not pick any of the choice or did not rank seminars at all randomly to any open seminar
        for(int g = 0; g < numStudents; g++){
            for(int r = 0; r <numRoom; r++){
                if(senior.get(g).getSeminar(session) == -1){
                    if(schedule[session][r].checkNum()&& schedule[session][r].getID() != senior.get(g).getSeminar(0)&&schedule[session][r].getID() != senior.get(g).getSeminar(1)&&schedule[session][r].getID() != senior.get(g).getSeminar(2)&&schedule[session][r].getID() != senior.get(g).getSeminar(3)&&schedule[session][r].getID() != senior.get(g).getSeminar(4)){
                        //holdstudent.get(g).setSeminar(hold5[0],p);
                        senior.get(g).setSeminar((hold5[r] +1),session);
                        schedule[session][r].addStudent(senior.get(g));
                    }//if
                }//if
            }//for
        }//for
    }//assignSchedule
    
    public void seminarRoster(int seminarID){//prints out roster based on inputted seminar ID
        for(int i = 0; i < numChoices; i++){
            for(int u = 0; u< numChoices; u++){
                if(schedule[i][u].getID() == seminarID){
                    System.out.print(schedule[i][u]);
                }
            }
        }
    }
    public void roomRoster(int roomNum){//prints out roster based on inputted room number
        for(int i = 0; i < numChoices; i++){
            for(int u = 0; u < numChoices; u++){
                if(schedule[i][u].getRm() == roomNum){
                    System.out.print(schedule[i][u]);
                }
            }
        }
    }
    public void studentRoster(String studentName){//prints out roster based on inputted student name
        for(int i = 0; i < numStudents; i++){
            if(senior.get(i).getName().equalsIgnoreCase(studentName)){
                System.out.print(senior.get(i));
            }
        }
    }
}//Schedule
