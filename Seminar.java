import java.util.ArrayList;

public class Seminar{
    private int seminarID;
    private int session1Run = -1;
    private int session2Run = -1;
    private String instru;
    private int rm1 = -1;
    private int rm2 = -1;
    private int numStudents = 0;
    private ArrayList<Student> studentList = new ArrayList<Student>();


public Seminar(int iSeminarID, String iInstru){
    seminarID = iSeminarID;
    instru = iInstru;
}
public void addStudent(Student s1){
    studentList.add(s1);
}
}