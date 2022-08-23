
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account mattsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}
