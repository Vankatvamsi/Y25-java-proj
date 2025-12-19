package com.skills;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("\nYour BMI is: " + bmi);

        sc.close();
    }
}
