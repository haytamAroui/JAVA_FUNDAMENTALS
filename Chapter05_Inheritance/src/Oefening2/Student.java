package Oefening2;

public class Student extends Person {

    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void introduce() {
        super.introduce();
        System.out.println("My student ID is " + studentId);
    }
}

