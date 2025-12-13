package com.homeassignments;

import java.util.Scanner;

public class HA02ElectrictyBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units > 0 && units <= 50) {
            bill = units * 2;
        } else if (units <= 100) {
            bill = 50 * 2 + (units - 50) * 4;
        } else if (units <= 150) {
            bill = 50 * 2 + 50 * 4 + (units - 100) * 6;
        } else if (units > 150) {
            bill = 50 * 2 + 50 * 4 + 50 * 6 + (units - 150) * 8;
        } else {
            System.out.println("Units cannot be zero or negative.");
            return;
            
        }

        System.out.println("Payable Amount: ₹" + bill);
    }
}