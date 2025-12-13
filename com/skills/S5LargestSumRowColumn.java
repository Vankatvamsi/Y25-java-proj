package com.skills;
import java.util.Scanner;
public class S5LargestSumRowColumn 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns (square matrix): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int maxRowSum = Integer.MIN_VALUE, rowIndex = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += mat[i][j];
            if (sum > maxRowSum) {
                maxRowSum = sum;
                rowIndex = i;
            }
        }
        // Column sum
        int maxColSum = Integer.MIN_VALUE, colIndex = -1;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += mat[i][j];
            if (sum > maxColSum) {
                maxColSum = sum;
                colIndex = j;
            }
        }
        System.out.println("Row with maximum sum: Row " + rowIndex + " (Sum = " + maxRowSum + ")");
        System.out.println("Column with maximum sum: Column " + colIndex + " (Sum = " + maxColSum + ")");
    }
}
