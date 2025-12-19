package com.labs;

//Lab Program: Prime Number Check (Optimized)
//Optimization: Check divisors only till square root of the number.

import java.util.Scanner;

public class PrimeOptimized {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input from user
     System.out.print("Enter a number: ");
     int num = sc.nextInt();

     boolean isPrime = true;

     // Special cases
     if (num <= 1) {
         isPrime = false;
     } else {
         // Check divisors only up to sqrt(num)
         for (int i = 2; i * i <= num; i++) {
             if (num % i == 0) {
                 isPrime = false;
                 break;
             }
         }
     }

     // Output the result
     if (isPrime) {
         System.out.println(num + " is a Prime Number.");
     } else {
         System.out.println(num + " is NOT a Prime Number.");
     }

     sc.close();
 }
}
