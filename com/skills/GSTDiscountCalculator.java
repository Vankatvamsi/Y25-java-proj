package com.skills;
import java.util.Scanner;

public class GSTDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter Original Cost: ");
        double cost = sc.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();
        System.out.print("Enter GST Percentage: ");
        double gst = sc.nextDouble();
        double priceAfterDiscount = cost - (cost * (discount / 100));
        double finalPrice = priceAfterDiscount + (priceAfterDiscount * (gst / 100));
        System.out.println("\n--- Final Bill Summary ---");
        System.out.println("Price After Discount: " + priceAfterDiscount);
        System.out.println("Final Price After GST: " + finalPrice);
        sc.close();
    }
}
