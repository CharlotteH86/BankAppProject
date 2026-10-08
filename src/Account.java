/**
 * Superclass for all account types. Subclasses inherit the shared fields
 * and override withdraw() and showInfo() with their own rules.
 **/
public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Starting balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        balance += amount;
    }

    // Each subclass decides its own withdrawal rules
    public abstract void withdraw(double amount);

    public void showInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
