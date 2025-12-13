package com.skills;
import java.util.Scanner;
public class S4KadanesAlgorithm 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < n; i++) 
        {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        System.out.println("Maximum Subarray Sum = " + maxSoFar);
    }
}
