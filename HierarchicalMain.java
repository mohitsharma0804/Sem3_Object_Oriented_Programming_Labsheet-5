// Q14: Hierarchical Inheritance — Person -> Doctor and Nurse
class Person {
    // Super Class
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

// Child Class 1
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void displayDoctor() {
        displayPerson();
        System.out.println("Role: Doctor | Specialization: " + specialization);
    }
}

// Child Class 2
class Nurse extends Person {
    private String ward;

    public Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    public void displayNurse() {
        displayPerson();
        System.out.println("Role: Nurse | Ward: " + ward);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Mehta", 48, "Cardiology");
        Nurse nurse = new Nurse("Sister Mary", 32, "ICU");

        doc.displayDoctor();
        System.out.println("-------------------------");
        nurse.displayNurse();
    }
}
