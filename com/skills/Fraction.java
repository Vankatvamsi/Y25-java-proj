package com.skills;
import java.util.Scanner;
public class Fraction {
    private int numerator;
    private int denominator;
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private void simplify() {
        int g = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= g;
        denominator /= g;
        if (denominator < 0) {
            numerator = -numerator;
       denominator = -denominator;
        }}
    Fraction add(Fraction other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Fraction(num, den);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter numerator of first fraction: ");
        int n1 = sc.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int d1 = sc.nextInt();
        System.out.print("Enter numerator of second fraction: ");
        int n2 = sc.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int d2 = sc.nextInt();
        Fraction f1 = new Fraction(n1, d1);
        Fraction f2 = new Fraction(n2, d2);
        Fraction sum = f1.add(f2);
        System.out.println("First Fraction: " + f1);
        System.out.println("Second Fraction: " + f2);
        System.out.println("Sum: " + sum);
        sc.close();
    }}