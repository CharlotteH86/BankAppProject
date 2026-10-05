public class CheckAccount extends Account {
// subklass till account
    private double overdraftLimit;

    public CheckAccount(
            String accountNumber,
            double balance,
            double overdraftLimit) {

        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
}