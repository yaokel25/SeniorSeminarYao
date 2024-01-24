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
    public ArrayList<Student> senior = new ArrayList<Student>();
    private int[] rankChoice = new int[20];//all seminar IDs except 0 is no choice and 19 is already completed choice
    private int numSeminars =20;//not 18 because no choice is 0 and 19 is already completed choice
    private int numRoom = 5;
    private int numStudents = 74;
    private int[] hold5 = new int[numRoom];
    private ArrayList<Seminar> seminarList = new ArrayList<Seminar>();

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
    }//method readFile

    public int[] getRank(){
        int holdChoice = 0;
        //initialize rankChoice array
        for(int i = 0; i < numSeminars; i++){
            rankChoice[i] = 0;
        }
        //tallying student choices
        for(Student s1: senior){
            holdChoice = s1.getChoice1();
            rankChoice[holdChoice] ++;
            holdChoice = s1.getChoice2();
            rankChoice[holdChoice] ++;
            holdChoice = s1.getChoice3();
            rankChoice[holdChoice] ++;
            holdChoice = s1.getChoice4();
            rankChoice[holdChoice] ++;
            holdChoice = s1.getChoice5();
            rankChoice[holdChoice] ++;
        }//for-49
        return rankChoice;
    }//method getRank
    
    
    public int[] get5(){
        //make copy of rankChoice array
        int[] holdSeminar = new int[numSeminars];
        for(int p = 0; p < numSeminars; p++){
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
            hold5[j] = holdIndex;
            holdSeminar[holdIndex] = 0;
            holdIndex = 0;
            holdNum = 0;
        }
        return hold5;
    }//method get5
    public void withRank(){
        ArrayList<Student> holdstudent = new ArrayList<Student>();
        for(int p = 0; p < numStudents; p++){
            holdstudent.add(senior.get(p));
        }
        for(int j = 0; j < numRoom; j++){
            for(int i = 0; i < numStudents; i++){
                if(holdstudent.get(i).getChoice1() == hold5[j]){
                    holdstudent.get(i).setSeminar1(hold5[j]);
                    holdstudent.get(i).setChoice1();
                    //need to add seminar
                }
            }
            for(int a = 0; a < numStudents; a++){
                if(holdstudent.get(a).getChoice2() == hold5[j] && holdstudent.get(a).getSeminar1() != -1){
                    holdstudent.get(a).setSeminar1(hold5[j]);
                    holdstudent.get(a).setChoice2();
                    //need to add seminar
                }
            }
            for(int b = 0; b < numStudents; b++){
                if(holdstudent.get(b).getChoice3() == hold5[j] && holdstudent.get(b).getSeminar1() != -1){
                    holdstudent.get(b).setSeminar1(hold5[j]);
                    holdstudent.get(b).setChoice3();
                    //need to add seminar
                }
            }
            for(int c = 0; c < numStudents; c++){
                if(holdstudent.get(c).getChoice4() == hold5[j] && holdstudent.get(c).getSeminar1() != -1){
                    holdstudent.get(c).setSeminar1(hold5[j]);
                    holdstudent.get(c).setChoice4();
                    //need to add seminar
                }
            }
            for(int d = 0; d < numStudents; d++){
                if(holdstudent.get(d).getChoice5() == hold5[j] && holdstudent.get(d).getSeminar1() != -1){
                    holdstudent.get(d).setSeminar1(hold5[j]);
                    holdstudent.get(d).setChoice5();
                    //need to add seminar
                }
            }
        }
        for(int g = 0; g < numStudents; g++){
            if(holdstudent.get(g).getSeminar1() == -1){

            }
        }
    }
}