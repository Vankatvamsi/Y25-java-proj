package com.skills;

import java.util.Scanner;
public class S4PairsWithSum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of K: ");
        int K = sc.nextInt();
        System.out.println("Pairs with sum " + K + ":");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] + arr[j] == K) 
                {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}

