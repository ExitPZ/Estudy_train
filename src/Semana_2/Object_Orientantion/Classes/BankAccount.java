package Semana_2.Object_Orientantion.Classes;

public class BankAccount {
    private String titular;
    private double balance;

    public BankAccount(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }
}
