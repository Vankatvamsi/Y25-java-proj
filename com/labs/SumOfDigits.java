package com.labs;
//Lab Program: Sum of Digits of a Number (Using while loop)

import java.util.Scanner;

public class SumOfDigits {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Taking input from the user
     System.out.print("Enter any number: ");
     int num = sc.nextInt();

     int sum = 0;   // to store total sum

     // while loop to extract and add digits
     while (num != 0) {
         int digit = num % 10;   // get last digit
         sum = sum + digit;      // add digit to sum
         num = num / 10;         // remove last digit
     }

     // Output
     System.out.println("Sum of digits = " + sum);

     sc.close();
 }
}

