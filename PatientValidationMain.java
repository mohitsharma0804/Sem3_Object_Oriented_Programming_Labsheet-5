// Q7: Encapsulated Patient - Validation
class Patient {
    private String patientName;
    private int age;
    private double weight;

    public Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age: " + age + " (Must be >= 0)");
        }
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid Weight: " + weight + " (Must be > 0)");
        }
    }

    public void displayPatient() {
        System.out.println("Patient: " + patientName + " | Age: " + age + " | Weight: " + weight + " kg");
    }
}

public class PatientValidationMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Rajesh", 35, 70.5);
        patient.displayPatient();

        System.out.println("\n--- Testing Invalid Setter Updates ---");
        patient.setAge(-5);
        patient.setWeight(0);

        System.out.println("\n--- Testing Valid Setter Updates ---");
        patient.setAge(36);
        patient.setWeight(72.0);
        patient.displayPatient();
    }
}
