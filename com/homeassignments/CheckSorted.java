package com.homeassignments;
import java.util.Scanner;
public class CheckSorted {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println(" 2500032048 ");
 System.out.print("Enter number of elements: ");
 int n = sc.nextInt();
 int arr[] = new int[n];
 System.out.println("Enter " + n + " elements:");
 for (int i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
 }
 boolean ascending = true;
 boolean descending = true;
 for (int i = 0; i < n - 1; i++) {
 if (arr[i] > arr[i + 1])
 ascending = false;
 if (arr[i] < arr[i + 1])
 descending = false;
 }
 if (ascending)
 System.out.println("Array is Sorted in Ascending Order");
 else if (descending)
 System.out.println("Array is Sorted in Descending Order");
 else
 System.out.println("Array is NOT Sorted");
 }
}
