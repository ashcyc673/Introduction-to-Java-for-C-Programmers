import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Student implements Serializable {
    private int _studentID = 0;
    private String _firstName = "";
    private String _lastName = "";
    private ArrayList<String> _courses = new ArrayList<String>();

    public Student() {}

    public Student(int studentID, String firstName, String lastName, ArrayList<String> courses) {
        _studentID = studentID;
        _firstName = firstName;
        _lastName = lastName;
        _courses = courses;
    }

    public void setID(int studentID) {
        _studentID = studentID;
    }

    public int getID() {
        return _studentID;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void addCourse(String courseName) {
        _courses.add(courseName);
    }

    public void removeCourse(String courseName) {
        _courses.removeIf(course -> course.equals(courseName));
    }
    
    public ArrayList<String> getCourses() {
    	return _courses;
    }

    public void SaveToFile(String filename) {
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(new Student(_studentID, _firstName, _lastName, _courses));
            writer.flush();
            writer.close();
            file.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    
    public void ReadFromFile(String filename) {
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream reader = new ObjectInputStream(file);
            Student student = (Student) reader.readObject();
            _studentID = student._studentID;
            _firstName = student._firstName;
            _lastName = student._lastName;
            _courses = student._courses;
            file.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

}

