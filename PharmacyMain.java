// Q3: Pharmacy — Instance and Class Variables
class Pharmacy {
    String pharmacyName;
    String location;

    // Class variable (static) shared across all Pharmacy instances
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++; // Increment shared count
    }

    void displayPharmacy() {
        System.out.println("Pharmacy Name: " + pharmacyName + " | Location: " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total Pharmacies Registered: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Apollo Pharmacy", "Downtown");
        Pharmacy p2 = new Pharmacy("MedPlus", "Central Park");
        Pharmacy p3 = new Pharmacy("Wellness Care", "North Wing");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();

        System.out.println("---------------------------------");
        Pharmacy.displayPharmacyCount();
    }
}
