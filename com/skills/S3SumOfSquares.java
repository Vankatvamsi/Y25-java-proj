package com.skills;

import java.util.Scanner;
public class S3SumOfSquares 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) 
        {
            sum += i * i;
        }
        System.out.println("Sum of series 1² + 2² + ... + " + N + "² = " + sum);
    }
}
