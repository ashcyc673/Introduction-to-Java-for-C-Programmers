import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private int _studentID = 0;
    private String _firstName = "";
    private String _lastName = "";
    private ArrayList<Course> _courses = new ArrayList<Course>();

    public Student() {}

    public Student(int studentID, String firstName, String lastName, ArrayList<Course> courses) {
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
        _courses.add(new Course(courseName));
    }

    public void removeCourse(String courseName) {
        _courses.removeIf(course -> course.getCourseName().equals(courseName));
    }

    public void display() {
        System.out.println("Student ID: " + _studentID);
        System.out.println("Student Name: " + _firstName + " " + _lastName);
        for (Course course : _courses) {
            course.display();
        }
    }
}

