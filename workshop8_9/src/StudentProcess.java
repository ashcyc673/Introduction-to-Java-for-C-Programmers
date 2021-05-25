import java.util.*;
import java.util.stream.Collectors;


public class StudentProcess {
    List<Student> student;

    public void displayStudentList(Student[] s){
//        System.out.println("Complete Student list:");
        student = Arrays.asList(s);
//        student.forEach(System.out::println);
    }

    public void gradeInRange() {
        System.out.println("Students who got 50.0-100.0 sorted by grade:");
        student.stream()
                .filter(s-> s.getGrade() >= 50 && s.getGrade() <= 100)
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out::println);
    }

    public void firstInRange() {
        System.out.println("First Student who got 50.0-100.0:");
       student.stream()
               .filter(s-> s.getGrade() >= 50 && s.getGrade() <= 100)
               .findFirst();
        System.out.println(student.get(0));
    }

    public void sortedByName() {
        System.out.println("Students in ascending order by last name then first:");
        student.stream()
                .sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Students in descending order by last name then first:");
        student.stream()
                .sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName).reversed())
                .forEach(System.out::println);
    }

    public void uniqueLastName() {
        System.out.println("Unique Student last names:");
        student.stream()
                .map(Student::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public void nameByOrder() {
        System.out.println("Student names in order by last name then first name:");
        student.stream()
                .sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
                .map(Student::getName)
                .forEach(System.out::println);

    }

    public void byDepartment() {
        System.out.println("Students by department:");
        student.stream()
                .collect(Collectors.groupingBy(Student::getDepartment))
                .forEach((d,s)-> {
                    System.out.println(d);
                    s.forEach((Student st)-> System.out.println("\t" + st));
                });
    }

    public void countStudent() {
        System.out.println("Count of Students by department:");
        new TreeMap<>(student.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())))
                .forEach((d,c) -> System.out.println(d + " has " + c + " Student(s)"));
    }

    public void studentSum() {
        System.out.println("Sum of Students' grades: " + student.stream()
                                  .mapToDouble(Student::getGrade)
                                  .sum());
    }

    public void studentAverage() {
        OptionalDouble avg = student.stream()
                .mapToDouble(Student::getGrade)
                .average();
        System.out.printf("Average of Students' grades: %.2f%n", avg.getAsDouble());
    }
}
