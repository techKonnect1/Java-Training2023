import java.awt.*;
import java.util.ArrayList;

public class Course {
    String courseName;
    List enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(Student student){
        enrolledStudents.add("courseName");
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students in " + courseName + ":");

    }
}
