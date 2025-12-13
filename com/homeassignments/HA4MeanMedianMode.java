package com.homeassignments;

import java.util.*;

public class HA4MeanMedianMode { 
        public static void main(String[] args) { 
            int[] a = {5, 3, 9, 3, 8, 2}; 
 
            Arrays.sort(a); 
 
            double sum = 0; 
            for (int x : a) sum += x; 
            double mean = sum / a.length; 
 
            double median; 
            if (a.length % 2 == 0) 
                median = (a[a.length/2] + a[a.length/2 - 1]) / 2.0; 
            else 
                median = a[a.length/2]; 
 
            int mode = a[0], maxCount = 1, count = 1; 
            for (int i = 1; i < a.length; i++) { 
                if (a[i] == a[i-1]) count++; 
                else count = 1; 
                if (count > maxCount) { 
                    maxCount = count; 
                    mode = a[i]; 
                } 
            } 
            System.out.println("Mean: " + mean); 
            System.out.println("Median: " + median); 
            System.out.println("Mode: " + mode); 
        } 
    } 