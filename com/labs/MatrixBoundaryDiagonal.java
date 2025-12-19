package labs;
//Lab 16: Matrix Boundary Sum and Diagonal Sum Combined

import java.util.Scanner;

public class MatrixBoundaryDiagonal {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input size of square matrix
     System.out.print("Enter the size of the matrix (n): ");
     int n = sc.nextInt();

     int a[][] = new int[n][n];

     // Input matrix elements
     System.out.println("Enter the elements of the matrix:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             a[i][j] = sc.nextInt();
         }
     }

     int boundarySum = 0;
     int diagonalSum = 0;

     // Calculating both sums
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {

             // Boundary condition
             if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                 boundarySum += a[i][j];
             }

             // Diagonal condition
             if (i == j || i + j == n - 1) {
                 diagonalSum += a[i][j];
             }
         }
     }

     // Output
     System.out.println("\nBoundary Sum = " + boundarySum);
     System.out.println("Diagonal Sum = " + diagonalSum);

     sc.close();
 }
}
