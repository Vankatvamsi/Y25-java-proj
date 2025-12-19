package com.labs;
//Lab 13: Sort Array Using Bubble Sort and Count Swaps

import java.util.Scanner;

public class BubbleSortCount {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size
     System.out.print("Enter the size of the array: ");
     int n = sc.nextInt();

     int arr[] = new int[n];

     // Input elements
     System.out.println("Enter " + n + " elements:");
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }

     int swaps = 0;  // to count number of swaps

     // Bubble Sort
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - 1 - i; j++) {
             if (arr[j] > arr[j + 1]) {

                 // swap
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;

                 swaps++;  // increase swap count
             }
         }
     }

     // Output sorted array
     System.out.println("\nSorted Array:");
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }

     // Output swap count
     System.out.println("\nTotal swaps = " + swaps);

     sc.close();
 }
}


