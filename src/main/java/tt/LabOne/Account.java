package tt.LabOne;

public class Account {

    // Attributes
    private int number;
    private double balance;

    // Constructor
    public Account(int number) {
        this.number = number;
        this.balance = 0.0;
    }

    // Accessors (getters)
    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    // Mutators (setters)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Account#: " + number + ", Balance: " + balance;
    }
}

