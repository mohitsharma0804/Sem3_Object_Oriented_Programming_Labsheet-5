// Q19: Hospital Staff Management — Integrated OOP
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;

    // Static class variable to count created employees
    public static int employeeCount = 0;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public String getName() { return name; }
    public int getAge() { return age; }
}

class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
}

class Pharmacist extends Employee {
    private String licenseNo;

    public Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() { return licenseNo; }
}

class StaffProcessor {
    public void processAndDisplay(Employee[] staff) {
        System.out.println("=== Hospital Staff List ===");
        for (int i = 0; i < staff.length; i++) {
            Employee emp = staff[i];
            System.out.print("ID: " + emp.getEmployeeId() + " | Name: " + emp.getName() + " | Age: " + emp.getAge() + " | Salary: $" + emp.getSalary());
            
            // Condition to filter/identify role
            if (emp instanceof Doctor) {
                Doctor d = (Doctor) emp;
                System.out.println(" | Role: Doctor | Specialization: " + d.getSpecialization());
            } else if (emp instanceof Pharmacist) {
                Pharmacist p = (Pharmacist) emp;
                System.out.println(" | Role: Pharmacist | License: " + p.getLicenseNo());
            }
        }
        System.out.println("Total Registered Employees: " + Employee.employeeCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staffList = {
            new Doctor("Dr. Arjun", 45, 101, 95000.0, "Orthopedics"),
            new Pharmacist("Kavita", 29, 102, 48000.0, "PH-887711")
        };

        StaffProcessor processor = new StaffProcessor();
        processor.processAndDisplay(staffList);
    }
}
