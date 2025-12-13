package com.homeassignments;
import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal of " + amount + " denied. Available balance: " + balance
            );
        }
        balance -= amount;
        System.out.println(" Withdrawal of " + amount + " successful. Remaining balance: " + balance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(" Deposit of " + amount + " successful. New balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "Account Holder: " + accountHolder + ", Balance: " + balance;
    }
}
public class HA9BankSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(name, balance);
        System.out.println("\n Account created successfully!");
        System.out.println(account);
        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundsException e) {
                        System.out.println(" Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(" Current Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println(" Thank you for banking with us!");
                    break;
                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}