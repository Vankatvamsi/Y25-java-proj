package com.homeassignments;
import java.util.Scanner;
public class Electricitybill {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter units consumed: ");
 int units = sc.nextInt();
 double bill = 50;
 if (units <= 100) {
 bill += units * 1.5;
 } else if (units <= 200) {
 bill += (100 * 1.5) + (units - 100) * 2.5;
 } else if (units <= 300) {
 bill += (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
 } else {
 bill += (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + (units - 300) * 5.0;
 }
 System.out.println("Total Electricity Bill = ₹" + bill);
 }
}
