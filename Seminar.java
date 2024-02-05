/** Keliang Yao
 * 2/03
 * This is the Seminar class, it holds information about seminars (ArrayList of Students attending that seminar, seminar name, seminar ID, instructor name, room number, session number)
 * it has methods to add students to the seminar, return name of instructor, return name of seminar, return number of students in seminar, check if there are less than 16 students attending the seminar,
 * setting the room of the seminar, setting the session of the seminar, and get the room of the seminar
 */

import java.util.ArrayList;

public class Seminar{
    private String name1;
    private int seminarID;
    private String instru;
    private int rm = -1;
    private int numStudents = 16;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int sessionNum = -1;
    
public Seminar(int iSeminarID, String iInstru, String name){//constructor-gets seminarID, instructor name, and seminar name and sets them
    seminarID = iSeminarID;
    instru = iInstru;
    name1 = name;
}
public void addStudent(Student s1){//add a student object to ArrayList of students
    studentList.add(s1);
}
public String getInstructor(){//return String of instructor name
    return instru;
}
public String getName(){//return String of name of seminar
    return name1;
}
public int getNum(){//returns number of students in Seminar
    return studentList.size();
}
public boolean checkNum(){//boolean to check if seminar is full
    if(studentList.size() >= numStudents){
        return false;
    }
    return true;
}
public void setRoom(int roomNum){//set the room numer of the seminar
    rm = roomNum;
}

public int getID(){//return seminarID
    return seminarID;
}
public void setSession(int session){//keeps track of which session the seminar is run 
    sessionNum = session;
}
public int getRm(){//returns room number
    return rm;
}
public String toString(){//toString-returns seminar and instructor name, seminar ID, room number, number of students, and students, session number
    return ("Seminar name: " + name1 + " ," + "Seminar ID: " + seminarID + " ," + "Instructor Name: " + instru + " ," + "session number: " + sessionNum + " ," + "Room #: " + rm  + " ," + "# of students: " + " ," + studentList.size() + " ," + "Students: " + studentList + "\n");
}
}
