public class BankAccount {

    // The account balance
    private int balance;

    // Constructor
    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Withdraws cash from the account
    public void withdraw(int amount){
        if (balance < amount) {

        }

        balance -= amount;
    }

    // Depositing cash into the account
    public void deposit(int amount) {
        balance += amount;
    }

    // Checking the account balance
    public int getBalance() {
        return balance;
    }
}