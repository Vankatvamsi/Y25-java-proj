package com.skills;

import java.util.Scanner;
public class S5MagicSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int sum = 0;
        for (int j = 0; j < n; j++)
            sum += mat[0][j]; // Row 1 sum as reference
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += mat[i][j];
            if (rowSum != sum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++)
                colSum += mat[i][j];
            if (colSum != sum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += mat[i][i];
            d2 += mat[i][n - 1 - i];
        }
        if (d1 == sum && d2 == sum)
            System.out.println("It is a Magic Square");
        else
            System.out.println("Not a Magic Square");
    }
}