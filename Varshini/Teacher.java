public class Teacher {
    String name;
    String teacherID;
    public Teacher(String name, String teacherID) {
        this.name = name;
        this.teacherID = teacherID;
    }
    public void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + teacherID);

    }
    public void assignGrade(Student student, String grade){

    }
}
