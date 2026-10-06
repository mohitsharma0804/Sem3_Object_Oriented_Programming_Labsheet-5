// Q6: Encapsulated Medicine Product
class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    public MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    // Getters and Setters
    public String getMedicineName() { return medicineName; }
    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }

    public String getBatchNo() { return batchNo; }
    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void displayProduct() {
        System.out.println("Medicine: " + medicineName + " | Batch: " + batchNo + " | Price: $" + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Ibuprofen", "B304", 15.0);

        System.out.println("Initial Record:");
        product.displayProduct();

        // Update through setter
        product.setPrice(18.5);

        // Read through getter
        System.out.println("Updated Price via Getter: $" + product.getPrice());
    }
}
