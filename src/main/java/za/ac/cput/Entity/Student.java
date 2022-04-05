package za.ac.cput.Entity;

public class Student {
    private String studentName;
    private String studentSurname;
    private int age;

    public Student(String studentName, String studentSurname, int age) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getAge() {
        return age;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", age=" + age +
                '}';
    }
}
