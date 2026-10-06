// Q11: Default Access Specifier
class Pharmacy {
    // Default/Package-Private instance variables (no access modifier keyword)
    String medicineName;
    double price;

    // Default constructor
    Pharmacy() {
        medicineName = "Aspirin";
        price = 8.50;
    }

    // Default method
    void displayMedicine() {
        System.out.println("Default Access Medicine: " + medicineName + " | Price: $" + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy p = new Pharmacy();

        // Directly accessing package-private members from the same package
        p.medicineName = "Aspirin 500mg";
        p.displayMedicine();
    }
}
