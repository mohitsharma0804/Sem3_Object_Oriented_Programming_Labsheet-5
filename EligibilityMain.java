// Q5: Medicine Eligibility — Method and Local Variable
class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        // Local variable to store result
        String result;
        if (patientAge >= ageLimit) {
            result = "Eligible for " + medicineName;
        } else {
            result = "Not Eligible for " + medicineName + " (Minimum age: " + ageLimit + ")";
        }
        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine med = new Medicine("Strong Painkiller", 18);

        System.out.println("Patient Age 15: " + med.checkEligibility(15));
        System.out.println("Patient Age 22: " + med.checkEligibility(22));
    }
}
