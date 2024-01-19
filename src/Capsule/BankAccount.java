package Capsule;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void submitMoney(double amount) {
        this.balance -= amount;
    }

    public void getMoney(double amount) {
        this.balance += amount;

    }


}
