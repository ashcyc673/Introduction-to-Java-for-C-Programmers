import java.util.Scanner;

public class ClassManager {
        private Classroom _classRoom = new Classroom();

        public ClassManager() {
        }

        public void createClassRoom() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter name of class room: ");
                _classRoom.setClassName(scanner.nextLine());
                System.out.print("Enter total number of student in the class: ");
                int studentNo = Integer.parseInt(scanner.nextLine());
                for (int nextStudent = 0; nextStudent < studentNo; ++nextStudent) {
                        Student student = new Student();
                        System.out.print("Enter student ID: ");
                        student.setID(Integer.parseInt(scanner.nextLine()));
                        System.out.print("Enter student first name: ");
                        student.setFirstName(scanner.nextLine());
                        System.out.print("Enter student last name: ");
                        student.setLastName(scanner.nextLine());
                        System.out.print("Enter total course this student is taking: ");
                        int courseNo = Integer.parseInt(scanner.nextLine());
                        for (int nextCourse = 0; nextCourse < courseNo; ++nextCourse) {
                                System.out.print("Enter course name: ");
                                student.addCourse(scanner.nextLine());
                        }
                        _classRoom.addStudent(student);
                }
        }

        public void saveToFile(String filename) {
                _classRoom.saveToFile(filename);
        }

        public void loadFromFile(String filename) {
                _classRoom.readFromFile(filename);
        }

        public void display() {
                _classRoom.display();
        }
}
