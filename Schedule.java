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
    private Seminar[][] schedule = new Seminar[5][5];
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
            int sessionID = Integer.parseInt(myArray[1]);
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
            for(int f = 0; f < numSeminars; f++){
                if(holdSeminar[f] > holdNum){
                    holdIndex = f;
                    holdNum = holdSeminar[f];
                }//if
            }
            if(canAdd(holdIndex)){
            hold5[j] = holdIndex;
            numTimes[holdIndex] ++;
            }
            holdSeminar[holdIndex] = 0;
            holdIndex = 0;
            holdNum = 0;
        }
        return hold5;
    }//method get5
    
    public void makeSchedule(int session){
        for(int i = 0; i < numRoom; i++){
            schedule[session][i] = seminarList.get(hold5[i]);
        }
    }
    
    public void assignSession(int session){
        ArrayList<Student> holdstudent = new ArrayList<Student>();
        for(int p = 0; p < numStudents; p++){
            holdstudent.add(senior.get(p));
        }
        for(int j = 0; j < numRoom; j++){
            for(int i = 0; i < numStudents; i++){
                for(int h = 0; h < numChoices; h++){
                    if(holdstudent.get(i).getChoice(h) == hold5[j] && schedule[session][j].checkNum()){
                        //holdstudent.get(i).setSeminar(hold5[j], h);
                        //holdstudent.get(i).setChoice(h);
                        senior.get(i).setSeminar(hold5[j], h);
                        senior.get(i).setChoice(h);
                        schedule[session][j].addStudent(holdstudent.get(i));
                    }
                }
            }
        }
        //assign students who did not pick any of the choice or did not rank seminars at all randomly to any open seminar
        for(int g = 0; g < numStudents; g++){
            for(int p = 0; p < numChoices; p++){
                if(holdstudent.get(g).getSeminar(p) == -1){
                    if(schedule[session][hold5[session]].checkNum()){
                        holdstudent.get(g).setSeminar(hold5[session],p);
                        senior.get(g).setSeminar(hold5[session],p);
                        schedule[session][hold5[session]].addStudent(holdstudent.get(g));
                    }
                }
            }
        }
    }
}