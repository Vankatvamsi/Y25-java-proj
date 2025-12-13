package com.skills;

import java.util.Scanner;
public class S2PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Stop checking if divisor is found
                }
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is NOT a prime number.");
    }  
  }   
