// Q10: Private Access Specifier
class Employee {
    // Private instance variables - accessible only inside Employee class
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Public getters to read private data
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void displayEmployee() {
        System.out.println("Emp ID: " + employeeId + " | Name: " + employeeName + " | Salary: $" + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee emp = new Employee(501, "Neha Gupta", 65000.0);

        // Access through getters and display method
        System.out.println("Reading via Getter - Salary: $" + emp.getSalary());
        emp.displayEmployee();

        // Direct access example (COMMENTED OUT as it causes a compile-time error):
        // System.out.println(emp.salary); // ERROR: salary has private access in Employee
    }
}
