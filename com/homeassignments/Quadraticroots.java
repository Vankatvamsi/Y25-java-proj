package com.homeassignments;
import java.util.Scanner;
public class Quadraticroots {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter coefficients a, b, c: ");
 double a = sc.nextDouble();
 double b = sc.nextDouble();
 double c = sc.nextDouble();
 double D = b * b - 4 * a * c;
 System.out.println("Discriminant = " + D);
 if (D > 0) {
 double root1 = (-b + Math.sqrt(D)) / (2 * a);
 double root2 = (-b - Math.sqrt(D)) / (2 * a);
 System.out.println("Roots are real and distinct.");
 System.out.println("Root1 = " + root1 + ", Root2 = " + root2);
 }
 else if (D == 0) {
 double root = -b / (2 * a);
 System.out.println("Roots are real and equal.");
 System.out.println("Root1 = Root2 = " + root);
 }
 else {
 double realPart = -b / (2 * a);
 double imagPart = Math.sqrt(-D) / (2 * a);
 System.out.println("Roots are imaginary.");
 System.out.println("Root1 = " + realPart + " + " + imagPart + "i");
 System.out.println("Root2 = " + realPart + " - " + imagPart + "i");
 }
 }
}
