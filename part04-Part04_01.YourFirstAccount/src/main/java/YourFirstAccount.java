
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account firstAccount = new Account("First account", 100.0);
        
        firstAccount.deposit(20);
        System.out.println(firstAccount);
    }
}
