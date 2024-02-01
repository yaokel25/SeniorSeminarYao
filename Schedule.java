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
    public ArrayList<Student> senior = new ArrayList<Student>();
    private int[] rankChoice = new int[18];//all seminar IDs except 0 is no choice and 19 is already completed choice
    private int numSeminars = 20;//not 18 because no choice is 0 and 19 is already completed choice
    private int numRoom = 5;
    private int numStudents = 74;
    private int[] hold5 = new int[numRoom];
    private ArrayList<Seminar> seminarList = new ArrayList<Seminar>();
    public Seminar[][] schedule = new Seminar[5][5];
    private int[] numTimes = new int[18];

    public boolean canAdd(int sessionID){
        if(numTimes[sessionID] >=2){
            return false;
        }
        return true;
    }
    public void makeSeminars(){
        
    }

    public void readFile(){
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

    public int[] getRank(){
        int holdChoice = 0;
        //initialize rankChoice array
        for(int i = 0; i < numSeminars - 2; i++){
            rankChoice[i] = 0;
        }
        
        //tallying student choices
        for(Student s1: senior){
            for(int i = 0; i < numChoices; i++){
                if(s1.getChoice(i) != 0 && s1.getChoice(i) != 19){
                    holdChoice = s1.getChoice(i) - 1;
                    rankChoice[holdChoice] ++;
                }
            }
        }//for-49
        System.out.println("getRank");
        return rankChoice;
    }//method getRank
    
    public int[] get5(){
        //make copy of rankChoice array
        int[] holdSeminar = new int[numSeminars - 2];
        for(int p = 0; p < numSeminars - 2; p++){
            holdSeminar[p] = rankChoice[p];
        }
        //get top 5 choices by doig bubble sort 5 times
        int holdIndex = 0;
        int holdNum = 0;
        for(int j = 0; j < numRoom; j++){
            for(int f = 0; f < numSeminars - 2; f++){
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

    
    public void makeSchedule(int session){
        ArrayList<Seminar> seminarList1 = new ArrayList<Seminar>();
        for(int t = 0; t < numSeminars - 2; t++){
            seminarList1.add(seminarList.get(t));
        }
        System.out.println("makeSchedule" + " " + session);
        for(int i = 0; i < numRoom; i++){
            schedule[session][i] = new Seminar(hold5[i], seminarList.get(i).getInstructor(), seminarList.get(i).getName());
            //schedule[session][i] = seminarList1.get(hold5[i]);//put top 5 available seminars into schedule at that session #
            schedule[session][i].setRoom(i);//set rooms for seminars
        }
        /*for(int t = 0; t < 5; t++){
            System.out.println(schedule[session][t] + " ");
        }
        for(int t = 0; t < 5; t++){
            System.out.println(schedule[session + 1][t] + " ");
        }*/
    }
    
    public void assignSession(int session){
        /*ArrayList<Student> holdstudent = new ArrayList<Student>();
        for(int p = 0; p < numStudents; p++){
            holdstudent.add(senior.get(p));
        }*/
        //System.out.print("Before: \n" + seminarList);
        for(int i = 0; i < numChoices; i++){
            for(int j = 0; j < numRoom; j++){
                for(int h = 0; h < numStudents; h++){
                    if(senior.get(h).getChoice(i) != 0 && senior.get(h).getChoice(i) != 19 && senior.get(h).getChoice(i) == (hold5[j]+1) && schedule[session][j].checkNum() && senior.get(h).getSeminar(session) == -1){
                        //holdstudent.get(i).setSeminar(hold5[j], h);
                        //holdstudent.get(i).setChoice(h);
                        //int choices = senior.get(h).getChoice(i);
                        senior.get(h).setSeminar((hold5[j]+1), session);
                        senior.get(h).setChoice(i);
                        schedule[session][j].addStudent(senior.get(h));
                        //System.out.println(senior.get(h)+ " , " + hold5[j] + " " + choices);
                    }
                }
            }
        }
        /*for(int g = 0; g < 5; g++){
            System.out.println(schedule[session][g]);
        }*/
        //assign students who did not pick any of the choice or did not rank seminars at all randomly to any open seminar
        for(int g = 0; g < numStudents; g++){
            for(int r = 4; r >= 0; r--){
                if(senior.get(g).getSeminar(session) == -1){
                    if(schedule[session][r].checkNum()&& schedule[session][r].getID() != senior.get(g).getSeminar(r)){
                        //holdstudent.get(g).setSeminar(hold5[0],p);
                        senior.get(g).setSeminar((hold5[r] +1),session);
                        schedule[session][r].addStudent(senior.get(g));
                    }
                }
            }
        }
    
        //System.out.print("After: " + seminarList);
        //System.out.print(schedule);
    }
    public Seminar[][] returnSchedule(){
        return schedule;
    }
}