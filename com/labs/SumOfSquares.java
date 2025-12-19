package com.labs;
import java.util.Scanner;

public class SumOfSquares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);  // adding square of i
        }

        System.out.println("Sum of series 1^2 + 2^2 + ... + " + n + "^2 = " + sum);
    }
}

