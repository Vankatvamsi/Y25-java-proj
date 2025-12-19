package com.labs;


import java.util.Scanner;

// Interface
interface Calculator {
    void calculate();   // common method
}

// Scientific Calculator
class ScientificCalculator implements Calculator {

    double a, b;

    ScientificCalculator(double x, double y) {
        a = x;
        b = y;
    }

    public void calculate() {
        System.out.println("Scientific Calculator:");
        System.out.println("Power (a^b) = " + Math.pow(a, b));
        System.out.println("Square Root of a = " + Math.sqrt(a));
        System.out.println("Square Root of b = " + Math.sqrt(b));
    }
}

// Financial Calculator
class FinancialCalculator implements Calculator {

    double principal, rate, time;

    FinancialCalculator(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    public void calculate() {
        System.out.println("Financial Calculator:");
        double si = (principal * rate * time) / 100;   // simple interest
        System.out.println("Simple Interest = " + si);
    }
}

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Scientific part
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter number b: ");
        double b = sc.nextDouble();

        ScientificCalculator sci = new ScientificCalculator(a, b);
        sci.calculate();

        System.out.println();

        // Financial part
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        FinancialCalculator fin = new FinancialCalculator(p, r, t);
        fin.calculate();
    }
}

