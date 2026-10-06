// Q16: Protected Parent + Private Child Data
class MedicalStaff {
    // Protected parent fields accessible by child classes
    protected int staffId;
    protected String staffName;

    public MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class Doctor extends MedicalStaff {
    // Private child field
    private String specialization;

    public Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    public void displayDoctor() {
        // Direct access to protected staffId & staffName
        System.out.println("Doctor ID: " + staffId + " | Name: " + staffName + " | Specialization: " + specialization);
    }
}

class Pharmacist extends MedicalStaff {
    // Private child field
    private String licenseNo;

    public Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        // Direct access to protected staffId & staffName
        System.out.println("Pharmacist ID: " + staffId + " | Name: " + staffName + " | License: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doc = new Doctor(101, "Dr. Sunita", "Neurology");
        Pharmacist pharm = new Pharmacist(102, "Raman", "PH-33211");

        doc.displayDoctor();
        pharm.displayPharmacist();
    }
}
