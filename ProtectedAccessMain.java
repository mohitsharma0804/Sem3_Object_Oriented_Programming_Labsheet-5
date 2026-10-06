// Q12: Protected Access Specifier
class HospitalStaff {
    // Protected instance variables accessible within package and by child classes
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId + " | Name: " + staffName);
    }
}

class Pharmacist extends HospitalStaff {
    private String licenseNo;

    public Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    public void showDetails() {
        // Direct access to inherited protected members staffId and staffName
        System.out.println("Pharmacist Details [ID: " + staffId + ", Name: " + staffName + ", License: " + licenseNo + "]");
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist(801, "Suresh Kumar", "LIC-998877");
        p.showDetails();
    }
}
