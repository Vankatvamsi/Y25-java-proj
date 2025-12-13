package com.skills;
import java.util.Scanner;

public class S6AllSubsetsBitmask {
    public static void printSubsets(int[] arr) {
        int n = arr.length;
        int total = 1 << n;           // 2^n

        for (int mask = 0; mask < total; mask++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of set: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All subsets:");
        printSubsets(arr);
        sc.close();
    }
}



