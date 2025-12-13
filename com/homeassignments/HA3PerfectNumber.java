package com.homeassignments;

import java.util.Scanner;

public class HA3PerfectNumber { 
        public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the number n"); 
            int n = sc.nextInt(); 
            int sum = 0; 
 
            for (int i = 1; i <= n / 2; i++) { 
                if (n % i == 0) { 
                    sum += i; 
                } 
            } 
 
            if (sum == n && n != 0) 
                System.out.println("Perfect number"); 
            else 
                System.out.println("Not a perfect number"); 
        }
}
