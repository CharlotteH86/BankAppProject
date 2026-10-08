/** Savings account: cannot be overdrawn and earns interest. **/
public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    @Override
    public void showInfo() {
        System.out.println("[Saving account]");
        super.showInfo();
        System.out.println("Interest rate: " + interestRate + "%");
    }
}
