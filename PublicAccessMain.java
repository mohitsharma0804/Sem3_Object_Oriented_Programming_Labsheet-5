// Q9: Public Access Specifier
class Hospital {
    // Public instance variables accessible from anywhere
    public String hospitalName;
    public String hospitalCode;

    // Public constructor
    public Hospital() {
        hospitalName = "City Care Hospital";
        hospitalCode = "CCH-2026";
    }

    // Public method
    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName + " (" + hospitalCode + ")");
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hosp = new Hospital();

        // Direct access to public fields from Main class
        System.out.println("Direct Access -> Name: " + hosp.hospitalName + ", Code: " + hosp.hospitalCode);
        hosp.displayHospital();
    }
}
