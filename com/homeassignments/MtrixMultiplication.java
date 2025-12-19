package com.homeassignments;
import java.util.Scanner;
public class MtrixMultiplication {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter rows and columns of first matrix (m n): ");
 int m = sc.nextInt();
 int n = sc.nextInt();
 System.out.print("Enter rows and columns of second matrix (p q): ");
 int p = sc.nextInt();
 int q = sc.nextInt();
 if (n != p) {
 System.out.println("Matrix multiplication not possible! Columns of A must equal rows of B");
 return;
 }
 int A[][] = new int[m][n];
 int B[][] = new int[p][q];
 int C[][] = new int[m][q];
 System.out.println("Enter elements of Matrix A:");
 for (int i = 0; i < m; i++)
 for (int j = 0; j < n; j++)
 A[i][j] = sc.nextInt();
 System.out.println("Enter elements of Matrix B:");
 for (int i = 0; i < p; i++)
 for (int j = 0; j < q; j++)
 B[i][j] = sc.nextInt();
 // Matrix multiplication logic
 for (int i = 0; i < m; i++) {
 for (int j = 0; j < q; j++) {
 for (int k = 0; k < n; k++) {
 C[i][j] += A[i][k] * B[k][j];
 }
 }
 }
 System.out.println("Resultant Matrix (C = A x B):");
 for (int i = 0; i < m; i++) {
 for (int j = 0; j < q; j++) {
 System.out.print(C[i][j] + " ");
 }
 System.out.println();
 }
 }
}