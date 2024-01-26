

public class Student{
    private String name;
    private String email;
    private int[] choice = new int[5];
    private int[] seminar = {-1,-1,-1,-1,-1};
    public Student(String email1, String name1, int iChoice1, int iChoice2, int iChoice3, int iChoice4, int iChoice5){
        email = email1;
        name = name1;
        choice[0] = iChoice1;
        choice[1] = iChoice2;
        choice[2] = iChoice3;
        choice[3] = iChoice4;
        choice[4] = iChoice5;
    }
    public int getChoice(int index){
        return choice[index];
    }
    public void setChoice(int index){
        choice[index] = 19;
    }
    public void setSeminar(int seminarNum, int index){
        seminar[index] = seminarNum;
    }
    public int getSeminar(int index){
        return seminar[index];
    }
   public String toString(){
    return(email + " " + name + " " + choice[0] + " " + choice[1] + " " + choice[2] + " " + choice[3] + " " + choice[4] + " " + seminar[0] + " " + seminar[1] + " " + seminar[2] + " " + seminar[3] + " " + seminar[4]);
   }

}