package com.homeassignments;
import java.util.Scanner;
public class AverageCalculator {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double sum = 0;
 System.out.println("ID no: 2500031933");
 System.out.println("Enter 5 numbers:");
 for (int i = 1; i <= 5; i++) {
 System.out.print("Number " + i + ": ");
 double num = sc.nextDouble();
 sum += num;
 }

 double avg = sum / 5;
 System.out.println("Average = " + avg);
 }
}