package com.homeassignments;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    private static final long serialVersionUID = 1L;
    InsufficientFundsException(String message) { super(message); }
}

public class BankWithdrawlSimulation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	System.out.println("ID no: 2500031933");
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            
            if (amount > balance) throw new InsufficientFundsException("Not enough balance");
            
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}
