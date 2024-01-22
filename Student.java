

public class Student{
    private String name;
    private String email;
    private int choice1;
    private int choice2;
    private int choice3;
    private int choice4;
    private int choice5;
    private int seminar1 = -1;
    private int seminar2 = -1;
    private int seminar3 = -1;
    private int seminar4 = -1;
    private int seminar5 = -1;
    public Student(String email1, String name1, int iChoice1, int iChoice2, int iChoice3, int iChoice4, int iChoice5){
        email = email1;
        name = name1;
        choice1 = iChoice1;
        choice2 = iChoice2;
        choice3 = iChoice3;
        choice4 = iChoice4;
        choice5 = iChoice5;
    }
    public int getChoice1(){
        return choice1;
    }
    public int getChoice2(){
        return choice2;
    }
    public int getChoice3(){
        return choice3;
    }
    public int getChoice4(){
        return choice4;
    }
    public int getChoice5(){
        return choice5;
    }
    public void setChoice1(){
        choice1 = 19;
    }
    public void setChoice2(){
        choice2 = 19;
    }
    public void setChoice3(){
        choice3 = 19;
    }
    public void setChoice4(){
        choice4 = 19;
    }
    public void setChoice5(){
        choice5 = 19;
    }
    public void setSeminar1(int seminarNum){
        seminar1 = seminarNum;
    }
    public void setSeminar2(int seminarNum){
        seminar2 = seminarNum;
    }
    public void setSeminar3(int seminarNum){
        seminar3 = seminarNum;
    }
    public void setSeminar4(int seminarNum){
        seminar4 = seminarNum;
    }
    public void setSeminar5(int seminarNum){
        seminar5 = seminarNum;
    }
    public int getSeminar1(){
        return seminar1;
    }
    public int getSeminar2(){
        return seminar2;
    }
    public int getSeminar3(){
        return seminar3;
    }
    public int getSeminar4(){
        return seminar4;
    }
    public int getSeminar5(){
        return seminar5;
    }
   public String toString(){
    return(email + " " + name + " " + choice1 + " " + choice2 + " " + choice3 + " " + choice4 + " " + choice5);
   }

}