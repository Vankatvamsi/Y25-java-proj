package com.homeassignments;
import java.util.*;
public class MeanMedianMode {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.print("Enter number of elements: ");
 int n = sc.nextInt();
 int arr[] = new int[n];
 System.out.println("Enter " + n + " elements:");
 for (int i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
 }
 // Mean
 double sum = 0;
 for (int num : arr) sum += num;
 double mean = sum / n;
 // Median
 Arrays.sort(arr);
 double median;
 if (n % 2 == 0)
 median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
 else
 median = arr[n / 2];
 // Mode
 int mode = arr[0], maxCount = 0;
 for (int i = 0; i < n; i++) {
 int count = 0;
 for (int j = 0; j < n; j++) {
 if (arr[j] == arr[i])
 count++;
 }
 if (count > maxCount) {
 maxCount = count;
 mode = arr[i];
 }
 }
 System.out.println("Mean = " + mean);
 System.out.println("Median = " + median);
 System.out.println("Mode = " + mode);
 }
}
