// Q2: Medicine — Parameterized Constructor and this
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    // Parameterized constructor using 'this' keyword to resolve shadowing
    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + " | Batch: " + batchNo + " | Price: $" + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine med1 = new Medicine("Paracetamol", "B101", 12.50);
        Medicine med2 = new Medicine("Amoxicillin", "B102", 25.00);

        med1.displayMedicine();
        med2.displayMedicine();
    }
}
