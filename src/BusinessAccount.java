/** Business account: every withdrawal costs a fixed transaction fee. **/
public class BusinessAccount extends Account implements TransactionsInterface {
    private double transactionFee;

    public BusinessAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        if (transactionFee < 0) {
            throw new IllegalArgumentException("Transaction fee cannot be negative");
        }
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        if (amount + transactionFee > balance) {
            throw new IllegalArgumentException("Insufficient funds (including fee)");
        }
        balance -= amount + transactionFee;
    }

    @Override
    public void showInfo() {
        System.out.println("[Business account]");
        super.showInfo();
        System.out.println("Transaction fee: " + transactionFee);
    }
}
