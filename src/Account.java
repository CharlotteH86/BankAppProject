public class Account {
    // Superklass
    private int accountNumber;
    private String accountName;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(int accountNumber, String accountName, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
