import java.awt.*;
import java.util.ArrayList;

public class Student {
    String name;
    String studentID;
    String enrolledCourses;

    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
        this.enrolledCourses = enrolledCourses;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Enrolled Courses: ");


    }

    public void enrollInCourse(Course course) {

        course.addStudent(this);

    }
}
