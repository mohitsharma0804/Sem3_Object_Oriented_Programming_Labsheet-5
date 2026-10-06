// Q8: Bank Account - Encapsulation, this and Local Variable
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        // Local variable boolean success
        boolean success;
        if (amount <= balance) {
            balance -= amount;
            success = true;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            success = false;
            System.out.println("Withdrawal failed! Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Acc No: " + accountNo + " | Holder: " + accountHolderName + " | Balance: $" + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC10023", "Vikram Seth", 500.0);
        acc.displayAccount();

        acc.deposit(200.0);
        acc.withdraw(800.0); // Insufficient
        acc.withdraw(300.0); // Success
        acc.displayAccount();
    }
}
