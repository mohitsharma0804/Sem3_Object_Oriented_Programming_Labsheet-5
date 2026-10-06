// Q1: Student Record — Class and Object
class Student {
    String name;
    int rollNo;
    double marks;

    // No-argument constructor
    Student() {
        name = "Aarav Sharma";
        rollNo = 101;
        marks = 88.5;
    }

    void displayDetails() {
        System.out.println("=== Student Details ===");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
