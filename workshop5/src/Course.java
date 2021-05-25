import java.io.Serializable;

public class Course implements Serializable {
    private String _courseName = "";

    public Course(String courseName) {
        _courseName = courseName;
    }

    public void setCourseName(String courseName) {
        _courseName = courseName;
    }

    public String getCourseName() {
        return _courseName;
    }

    public void display() {
        System.out.println("Course name: " + _courseName);
    }
}
