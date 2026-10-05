import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        SavingAccount account1 =
                new SavingAccount("10001", 10000, 2.5);

        AccountUsers.AccountUser user1 =
                new AccountUsers.AccountUser(
                        "Miyagi",
                        "Svensson",
                        "19900101-0001",
                        account1
                );

        ArrayList<AccountUsers.AccountUser> users = new ArrayList<>();

        users.add(user1);

        System.out.println("User: " + user1.getFirstName() + " " + user1.getLastName());
        System.out.println("Account Number: " + user1.getAccount().accountNumber);
        System.out.println("Balance: " + user1.getAccount().getBalance());


    }
}
