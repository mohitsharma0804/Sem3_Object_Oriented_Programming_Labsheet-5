// Q4: Patient Records — Object Array, Loop and Local Variable
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + " | Name: " + patientName + " | Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        System.out.println("=== Patient List ===");
        // Local loop variable i
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Rohan", 45),
            new Patient(2, "Priya", 30),
            new Patient(3, "Amit", 62),
            new Patient(4, "Sneha", 12),
            new Patient(5, "Karan", 25)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
