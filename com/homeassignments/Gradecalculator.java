package com.homeassignments;
import java.util.Scanner;
public class Gradecalculator {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double total = 0;
 System.out.println("2500032048");
 System.out.println("Enter marks for 5 subjects (out of 100):");
 for (int i = 1; i <= 5; i++) {
 System.out.print("Subject " + i + ": ");
 double marks = sc.nextDouble();
 total += marks;
 }
 double percentage = total / 5;
 System.out.println("Percentage = " + percentage + "%");
 if (percentage >= 90)
 System.out.println("Grade: A+");
 else if (percentage >= 80)
 System.out.println("Grade: A");
 else if (percentage >= 70)
 System.out.println("Grade: B");
 else if (percentage >= 60)
 System.out.println("Grade: C");
 else if (percentage >= 50)
 System.out.println("Grade: D");
 else
 System.out.println("Grade: F (Fail)");
 }
}