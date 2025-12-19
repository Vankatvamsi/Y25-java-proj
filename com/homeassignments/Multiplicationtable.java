package com.homeassignments;
import java.util.Scanner;
public class Multiplicationtable {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("2500032048 ");
 System.out.print("Enter a number: ");
 int n = sc.nextInt();
 System.out.println("Multiplication Table for " + n + ":");
 for (int i = 1; i <= 10; i++) {
 System.out.println(n + " x " + i + " = " + (n * i));
 }
 }
}
