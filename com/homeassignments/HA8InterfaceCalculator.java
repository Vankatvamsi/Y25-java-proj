package com.homeassignments;
import java.util.Scanner;
// Interface
interface Calculator {
    double calculate(double a, double b);
}
// Scientific Calculator
class ScientificCalculator implements Calculator {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b); // a^b
    }
}
// Financial Calculator
class FinancialCalculator implements Calculator {
    @Override
    public double calculate(double principal, double rate) {
        return principal + (principal * rate / 100); // simple interest
    }
}

public class HA8InterfaceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Scientific Calculator (a^b):");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        Calculator sciCalc = new ScientificCalculator();
        System.out.println("Result: " + sciCalc.calculate(a, b));

        System.out.println("\nFinancial Calculator (Simple Interest):");
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate(%): ");
        double r = sc.nextDouble();
        Calculator finCalc = new FinancialCalculator();
        System.out.println("Total Amount: " + finCalc.calculate(p, r));

        sc.close();
    }
}
