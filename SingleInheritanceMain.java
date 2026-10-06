// Q13: Single Inheritance — Employee -> Pharmacist
class Employee {
    // Super Class
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Emp ID: " + employeeId + " | Name: " + employeeName + " | Salary: $" + salary);
    }
}

// Child Class extending Super Class
class Pharmacist extends Employee {
    private String licenseNo;

    public Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary); // Super class constructor invocation
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        displayEmployee(); // Inherited method
        System.out.println("License No: " + licenseNo);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharm = new Pharmacist(1001, "Anil Kapoor", 55000.0, "PH-55443");
        pharm.displayPharmacist();
    }
}
