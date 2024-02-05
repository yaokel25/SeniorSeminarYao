/** Keliang Yao
 * 2/03
 * This is the Student class used to get and set information about students (email and name), their choices, and the seminars they are scheduled for
 * it is used to store information about student choices and their schedule
 */

public class Student{
    private String name;
    private String email;
    private int[] choice = new int[5];
    private int[] seminar = {-1,-1,-1,-1,-1};
    public Student(String email1, String name1, int iChoice1, int iChoice2, int iChoice3, int iChoice4, int iChoice5){//constructor-gets choices and name and email from csv file and sets them
        email = email1;
        name = name1;
        choice[0] = iChoice1;
        choice[1] = iChoice2;
        choice[2] = iChoice3;
        choice[3] = iChoice4;
        choice[4] = iChoice5;
    }
    public int getChoice(int index){//get their choice
        return choice[index];
    }
    public void setChoice(int index){//after they got their choice, set it to 19
        choice[index] = 19;
    }
    public void setSeminar(int seminarNum, int index){//set their seminar# for that session to the seminarID
        seminar[index] = seminarNum;
    }
    public int getSeminar(int index){//return the seminarID at that session
        return seminar[index];
    }
    public String getName(){//returns student name
        return name;
    }
   public String toString(){//toString method-returns email, name, seminarIDs 
    return("email: " + email + " ," + "name: " + name + " ," + "Seminar 1: " + seminar[0] + " Seminar 2: " + seminar[1] + " Seminar 3: " + seminar[2] + " Seminar 4: " + seminar[3] + " Seminar 5: " + seminar[4] + "\n");
   }

}