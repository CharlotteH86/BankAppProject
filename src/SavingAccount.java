public class SavingAccount extends Account {
    // subklass till Account
    private double interestRate;

    public SavingAccount(
            String accountNumber,
            double balance,
            double interestRate) {

        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}