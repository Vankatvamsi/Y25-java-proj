package com.labs;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for centimeter to meter conversion
        System.out.print("Enter value in centimeters: ");
        double cm = sc.nextDouble();

        // Conversion
        double meters = cm / 100.0;

        // Output
        System.out.println("Value in meters: " + meters);


        // Input for kilogram to gram conversion
        System.out.print("\nEnter value in kilograms: ");
        double kg = sc.nextDouble();

        // Conversion
        double grams = kg * 1000.0;

        // Output
        System.out.println("Value in grams: " + grams);

        sc.close();
    }
}
