package com.labs;

//Lab 11: Linear Search Implementation

import java.util.Scanner;

public class LinearSearch {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Taking array size
     System.out.print("Enter the size of the array: ");
     int n = sc.nextInt();

     int arr[] = new int[n];

     // Input array elements
     System.out.println("Enter " + n + " elements:");
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }

     // Element to search
     System.out.print("Enter the element to search: ");
     int key = sc.nextInt();

     boolean found = false;
     int position = -1;

     // Linear Search
     for (int i = 0; i < n; i++) {
         if (arr[i] == key) {
             found = true;
             position = i;   // store index
             break;
         }
     }

     // Output
     if (found) {
         System.out.println(key + " found at index " + position);
     } else {
         System.out.println(key + " not found in the array.");
     }

     sc.close();
 }
}

