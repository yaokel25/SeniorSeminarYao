import java.util.ArrayList;

public class Seminar{
    private String name1;
    private int seminarID;
    //private int session1Run = -1;
    //private int session2Run = -1;
    private String instru;
    private int rm = -1;
    //private int rm2 = -1;
    private int numStudents = 16;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    
public Seminar(int iSeminarID, String iInstru, String name){
    seminarID = iSeminarID;
    instru = iInstru;
    name1 = name;
}
public void addStudent(Student s1){
    studentList.add(s1);
}
public boolean checkNum(){
    if(studentList.size() >= numStudents){
        return false;
    }
    return true;
}
public void setRoom(int roomNum){
    rm = roomNum;
}
public String toString(){
    return (name1 + " " + seminarID + " " + instru + " " + rm  + " " + studentList.size());
}
}