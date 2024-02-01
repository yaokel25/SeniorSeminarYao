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
public String getInstructor(){
    return instru;
}
public String getName(){
    return name1;
}
public int getNum(){
    return studentList.size();
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
public void clearStudents(){
    int numPeople = studentList.size() - 1;
    for(int i = 0; i < numPeople; i++){
        studentList.remove(i);
    }
}
public int getID(){
    return seminarID;
}
public String toString(){
    return (name1 + " " + seminarID + " " + instru + " " + rm  + " " + studentList.size() + " " + studentList + "\n");
}
}