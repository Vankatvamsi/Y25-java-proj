package com.skills;

import java.util.Scanner;
public class S1GstAndDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original cost: ");
        double cost = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();
        System.out.print("Enter GST percentage: ");
        double gstPercent = sc.nextDouble();
        double discountAmount = (discountPercent / 100.0) * cost;
        double priceAfterDiscount = cost - discountAmount;
        double gstAmount = (gstPercent / 100.0) * priceAfterDiscount;
        double finalPrice = priceAfterDiscount + gstAmount;
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Original Cost       : " + cost);
        System.out.println("Discount Amount     : " + discountAmount);
        System.out.println("Price After Discount: " + priceAfterDiscount);
        System.out.println("GST Amount          : " + gstAmount);
        System.out.println("Final Price to Pay  : " + finalPrice);
    }
}
