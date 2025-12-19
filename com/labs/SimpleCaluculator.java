package com.labs;
import java.util.Scanner;
public class SimpleCaluculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

       
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;     // assuming num2 is not zero
        int remainder = num1 % num2;

       
        System.out.println("\n--- Results ---");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
