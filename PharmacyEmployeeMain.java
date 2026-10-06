// Q20: Final Challenge — Pharmacy Employee Management System
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    // Class variable shared by all instances
    public static int employeeCount = 0;

    // Protected variable where inheritance benefits
    protected String department = "General Pharmacy";

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++; // Increment static counter
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Validation Error: Salary cannot be negative!");
            this.salary = 0.0;
        }
    }

    // Default-access method
    void displayBaseDetails() {
        System.out.print("[ID: " + employeeId + ", Name: " + employeeName + ", Dept: " + department + ", Salary: $" + salary + "]");
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    public Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() { return licenseNo; }
}

class StoreManager extends Employee {
    private int storeSection;

    public StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    public int getStoreSection() { return storeSection; }
}

class PharmacyManager {
    public void processEmployees(Employee[] employees) {
        // Local variables
        double totalPayroll = 0;
        int activeCount = 0;

        System.out.println("=============================================");
        System.out.println("   PHARMACY EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("=============================================");

        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            emp.displayBaseDetails();

            // Condition to identify role
            if (emp instanceof Pharmacist) {
                Pharmacist p = (Pharmacist) emp;
                System.out.println(" -> Role: Pharmacist | License: " + p.getLicenseNo());
            } else if (emp instanceof StoreManager) {
                StoreManager m = (StoreManager) emp;
                System.out.println(" -> Role: Store Manager | Section: " + m.getStoreSection());
            }

            totalPayroll += emp.getSalary();
            activeCount++;
        }

        System.out.println("---------------------------------------------");
        System.out.println("Total Active Staff Processed: " + activeCount);
        System.out.println("Total Shared Class Count    : " + Employee.employeeCount);
        System.out.println("Total Monthly Payroll Expense: $" + totalPayroll);
        System.out.println("=============================================");
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] roster = {
            new Pharmacist(701, "Deepak Roy", 52000.0, "PH-9900"),
            new StoreManager(702, "Sunil Dutt", 68000.0, 3),
            new Pharmacist(703, "Meera Joshi", -5000.0, "PH-9901") // Demonstrates salary validation safeguard
        };

        PharmacyManager manager = new PharmacyManager();
        manager.processEmployees(roster);
    }
}
