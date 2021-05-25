import java.io.*;
import java.util.ArrayList;

public class Classroom implements Serializable {
    private String _className = "";
    private ArrayList<Student> _students = new ArrayList<Student>();

    public Classroom() {
    }

    public Classroom(String className) {
        _className = className;
    }

    public Classroom(String className, ArrayList<Student> students) {
        _className = className;
        _students = students;
    }

    public Classroom(Classroom classroom) {
        _className = classroom._className;
        _students = classroom._students;
    }

    public void setClassName(String className) {
        _className = className;
    }

    public String getClassName() {
        return _className;
    }

    public void setStudents(ArrayList<Student> students) {
        _students = students;
    }

    public ArrayList<Student> getStudents() {
        return _students;
    }

    public void addStudent(Student student) {
        _students.add(student);
    }

    public void removeStudent(int studentID) {
        _students.removeIf(student -> student.getID() == studentID);
    }

    public Student getStudent(int studentID) {
        for (Student student : _students) {
            if (student.getID() == studentID) return student;
        }
        return null;
    }

    public void saveToFile(String filename) {
        try {
            FileOutputStream datafile = new FileOutputStream(filename);
            ObjectOutputStream fileWriter = new ObjectOutputStream(datafile);
            Classroom classroom = new Classroom(_className, _students);
            fileWriter.writeObject(classroom);
            fileWriter.flush();
            fileWriter.close();
            datafile.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        try {
            FileInputStream dataFile = new FileInputStream(filename);
            ObjectInputStream fileReader = new ObjectInputStream(dataFile);
            Classroom classroom = new Classroom((Classroom) fileReader.readObject());
            setClassName(classroom._className);
            setStudents(classroom._students);
            fileReader.close();
            dataFile.close();
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public void display() {
        System.out.println("Class name: " + _className);
        for (Student student : _students) {
            student.display();
        }
    }
}
