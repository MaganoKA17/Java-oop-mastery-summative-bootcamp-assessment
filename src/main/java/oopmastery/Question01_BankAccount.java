package oopmastery;

public class Question01_BankAccount {

    private String owner;
    private double balance;

    public Question01_BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public void deposit(double amount) {
        // TODO:
        // Add the amount to the balance
        // Ignore negative deposits
        if (amount < 0){
            ;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        // TODO:
        // Only withdraw if:
        // 1. amount is positive
        // 2. sufficient funds exist
        // Balance may never become negative

        if (amount > this.balance && this.balance == 0) getBalance();
        this.balance -= amount;
    }

    public double getBalance() {
        // TODO:
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }
}
