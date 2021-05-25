public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private String department;

    public Student(String firstName, String lastName, double grade, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName(){
        return getFirstName() + " " + getLastName();
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-10.2f%s",getFirstName(),getLastName(),getGrade(),getDepartment());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
