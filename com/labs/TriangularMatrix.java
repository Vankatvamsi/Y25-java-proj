package com.labs;

//Lab 15: Upper and Lower Triangular Matrix Elements

import java.util.Scanner;

public class TriangularMatrix {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input matrix size
     System.out.print("Enter the size of the square matrix (n): ");
     int n = sc.nextInt();

     int a[][] = new int[n][n];

     // Input matrix elements
     System.out.println("Enter the elements of the matrix:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             a[i][j] = sc.nextInt();
         }
     }

     // Upper Triangular Matrix
     System.out.println("\nUpper Triangular Matrix:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {

             if (i <= j)       // condition for upper triangle
                 System.out.print(a[i][j] + " ");
             else
                 System.out.print("0 ");
         }
         System.out.println();
     }

     // Lower Triangular Matrix
     System.out.println("\nLower Triangular Matrix:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {

             if (i >= j)       // condition for lower triangle
                 System.out.print(a[i][j] + " ");
             else
                 System.out.print("0 ");
         }
         System.out.println();
     }

     sc.close();
 }
}

