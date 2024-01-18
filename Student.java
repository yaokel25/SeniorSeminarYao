

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
   public String toString(){
    return(email + " " + name + " " + choice1 + " " + choice2 + " " + choice3 + " " + choice4 + " " + choice5);
   }

}