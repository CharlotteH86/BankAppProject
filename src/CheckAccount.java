/** Checking account: balance may go below zero down to the overdraft limit. **/
public class CheckAccount extends Account {
    private double overdraftLimit;

    public CheckAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative");
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (amount > balance + overdraftLimit) {
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }
        balance -= amount;
    }

    @Override
    public void showInfo() {
        System.out.println("[Check account]");
        super.showInfo();
        System.out.println("Overdraft limit: " + overdraftLimit);
    }
}
