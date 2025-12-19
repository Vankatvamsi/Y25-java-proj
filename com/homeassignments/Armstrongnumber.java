package com.homeassignments;
import java.util.Scanner;
public class Armstrongnumber {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println(" 2500032048 ");
 System.out.println("Enter a number: ");
 int num = sc.nextInt();
 int temp = num, sum = 0, digits = 0;
 int n = num;
 while (n > 0) {
 digits++;
 n /= 10;
 }
 n = num;
 while (n > 0) {
 int rem = n % 10;
 sum += Math.pow(rem, digits);
 n /= 10;
 }
 if (sum == num)
 System.out.println(num + " is an Armstrong Number");
 else
 System.out.println(num + " is NOT an Armstrong Number");
 }
}
