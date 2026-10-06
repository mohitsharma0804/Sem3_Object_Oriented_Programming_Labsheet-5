// Q15: Multilevel Inheritance — Person -> Employee -> Manager
// Level 1: Top-level Super Class
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Level 2: Intermediate Child Class / Super Class for Manager
class Employee extends Person {
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Level 3: Final Child Class
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    public void displayManager() {
        System.out.println("Manager: " + name + " | Age: " + age + 
                           " | Emp ID: " + getEmployeeId() + " | Team Size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Sanjay Verma", 42, 9001, 15);
        mgr.displayManager();
    }
}
