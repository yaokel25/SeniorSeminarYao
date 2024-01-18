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

    public void readFile(){
        try {
            File myObj = new File("SrSeminar.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] myArray = data.split(",", 0);
            email = myArray[0];
            name = myArray[1];
            choice1 = Integer.parseInt(myArray[2]) - 1;
            System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}