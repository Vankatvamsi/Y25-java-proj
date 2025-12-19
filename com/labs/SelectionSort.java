package labs;
//Lab: Sort Array Using Selection Sort (Very Basic)

import java.util.Scanner;

public class SelectionSort {
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

     // Selection Sort
     for (int i = 0; i < n - 1; i++) {

         int minIndex = i;   // assume current index is the smallest

         // find the smallest element in the remaining array
         for (int j = i + 1; j < n; j++) {
             if (arr[j] < arr[minIndex]) {
                 minIndex = j;
             }
         }

         // swap smallest with the current index
         int temp = arr[i];
         arr[i] = arr[minIndex];
         arr[minIndex] = temp;
     }

     // Output sorted array
     System.out.println("\nSorted Array:");
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }

     sc.close();
 }
}

