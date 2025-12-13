package com.labs;
import java.util.Scanner;
// Base class
class Account {
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
// Derived class
class SavingsAccount extends Account {
    private double minimumBalance;
    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied! Minimum balance must be maintained.");
        }
    }
}
// Further derived class
class InterestAccount extends SavingsAccount {
    private double interestRate;
    public InterestAccount(String accountNumber, double balance, double minimumBalance, double interestRate) {
        super(accountNumber, balance, minimumBalance);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
}
// Demo with Scanner
public class L26BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Minimum Balance: ");
        double minBalance = sc.nextDouble();
        System.out.print("Enter Interest Rate (%): ");
        double interestRate = sc.nextDouble();
        // Create InterestAccount object
        InterestAccount ia = new InterestAccount(accNo, balance, minBalance, interestRate);
        // Perform operations
        System.out.print("Enter deposit amount: ");
        double depositAmt = sc.nextDouble();
        ia.deposit(depositAmt);
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmt = sc.nextDouble();
        ia.withdraw(withdrawAmt);
        ia.applyInterest();
        System.out.println("Final Balance in Account " + ia.getAccountNumber() + ": " + ia.getBalance());
    }
}