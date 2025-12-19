package com.labs;

//Lab: Binary Search Implementation

import java.util.Scanner;

public class BinarySearch {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size of array
     System.out.print("Enter the size of the array: ");
     int n = sc.nextInt();

     int arr[] = new int[n];

     // Input must be in sorted order
     System.out.println("Enter " + n + " elements in sorted order:");
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }

     // Element to search
     System.out.print("Enter the element to search: ");
     int key = sc.nextInt();

     int low = 0;
     int high = n - 1;
     int mid;
     boolean found = false;

     // Binary Search Logic
     while (low <= high) {

         mid = (low + high) / 2;   // find middle index

         if (arr[mid] == key) {
             found = true;
             System.out.println(key + " found at index " + mid);
             break;
         } else if (key < arr[mid]) {
             high = mid - 1;       // search left half
         } else {
             low = mid + 1;        // search right half
         }
     }

     if (!found) {
         System.out.println(key + " not found in the array.");
     }

     sc.close();
 }
}
