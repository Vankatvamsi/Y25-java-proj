package com.skills;

import java.util.Scanner;
public class S4ReverseArray 
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
        for (int i = 0; i < n / 2; i++) 
        {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.print("Reversed Array: ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
