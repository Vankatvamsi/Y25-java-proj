package com.labs;
//Lab 9: Generate Prime Numbers up to N

import java.util.Scanner;

public class PrimeUptoN {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input
     System.out.print("Enter the value of N: ");
     int n = sc.nextInt();

     System.out.println("\nPrime numbers up to " + n + " are:");

     // Loop through all numbers from 2 to n
     for (int i = 2; i <= n; i++) {

         boolean isPrime = true;

         // Check prime only up to √i
         for (int j = 2; j * j <= i; j++) {
             if (i % j == 0) {
                 isPrime = false;
                 break;
             }
         }

         // If still prime, print it
         if (isPrime) {
             System.out.print(i + " ");
         }
     }

     sc.close();
 }
}


