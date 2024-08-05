package springQualifierexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Profile {


    @Autowired
    @Qualifier("student1")
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    public void printAge() {
        System.out.println("student Age : " + student.getAge() );
    }
    public void printName() {
        System.out.println("student Name : " + student.getName() );
    }
}
