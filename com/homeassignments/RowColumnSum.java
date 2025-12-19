package com.homeassignments;
import java.util.Scanner;
public class RowColumnSum {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter number of rows and columns: ");
 int m = sc.nextInt();
 int n = sc.nextInt();
 int A[][] = new int[m][n];
 System.out.println("Enter elements of the matrix:");
 for (int i = 0; i < m; i++)
 for (int j = 0; j < n; j++)
 A[i][j] = sc.nextInt();
 // Row-wise sum
 System.out.println("Row-wise Sums:");
 for (int i = 0; i < m; i++) {
 int rowSum = 0;
 for (int j = 0; j < n; j++) {
 rowSum += A[i][j];
 }
 System.out.println("Sum of Row " + (i + 1) + " = " + rowSum);
 }
 // Column-wise sum
 System.out.println("Column-wise Sums:");
 for (int j = 0; j < n; j++) {
 int colSum = 0;
 for (int i = 0; i < m; i++) {
 colSum += A[i][j];
 }
 System.out.println("Sum of Column " + (j + 1) + " = " + colSum);
 }
 }
}
