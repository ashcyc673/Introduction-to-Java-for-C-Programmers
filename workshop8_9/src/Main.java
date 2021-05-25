import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student[] students = {
                new Student("Jack", "Smith", 50.0, "IT"),
                new Student("Aaron", "Johnson", 76.0, "IT"),
                new Student("Maaria", "White", 35.8, "Business"),
                new Student("John", "White", 47.0, "Media"),
                new Student("Laney", "White", 62.0, "IT"),
                new Student("Jack", "Jones", 32.9, "Business"),
                new Student("Wesley", "Jones", 42.89, "Media")};


        StudentProcess studentProcess = new StudentProcess();

//        System.out.println("Task 1:");
//        System.out.println();
        studentProcess.displayStudentList(students);
//        System.out.println();

//        System.out.println("Task 2:");
//        System.out.println();
//        studentProcess.gradeInRange();
//        System.out.println();
//
//        System.out.println("Task 3:");
//        System.out.println();
//        studentProcess.firstInRange();
//        System.out.println();
//
//        System.out.println("Task 4:");
//        System.out.println();
//        studentProcess.sortedByName();
//        System.out.println();
//
//        System.out.println("Task 5:");
//        System.out.println();
//        studentProcess.uniqueLastName();
//        System.out.println();

        System.out.println("Task 6:");
        System.out.println();
        studentProcess.nameByOrder();
        System.out.println();

        System.out.println("Task 7:");
        System.out.println();
        studentProcess.byDepartment();
        System.out.println();

        System.out.println("Task 8:");
        System.out.println();
        studentProcess.countStudent();
        System.out.println();

        System.out.println("Task 9:");
        System.out.println();
        studentProcess.studentSum();
        System.out.println();

        System.out.println("Task 10:");
        System.out.println();
        studentProcess.studentAverage();
        System.out.println();
    }
}
