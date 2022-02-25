package Herencia;

public class Student extends Person{

    private String grade;

    public Student(String name,String grade) {
        super(name);
        this.grade=grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
