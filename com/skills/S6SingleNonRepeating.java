package com.skills;
import java.util.Scanner;

public class S6SingleNonRepeating {
    public static int singleNumber(int[] arr) {
        int x = 0;
        for (int num : arr) {
            x ^= num;          // XOR of all elements
        }
        return x;              // remaining is the single element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = singleNumber(arr);
        System.out.println("Single non-repeating element = " + ans);
        sc.close();
    }
}
