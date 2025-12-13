package com.homeassignments;

public class HA4CheckingOfSortedArray 
{ 
    public static void main(String[] args) 
    { 
        int[] a = {9, 7, 7, 4, 1}; 
 
        boolean asc = true, desc = true; 
 
        for (int i = 1; i < a.length; i++) 
        { 
            if (a[i] < a[i-1])
            	{
            	asc = false;
            	}
            if (a[i] > a[i-1]) 
            	{
            	desc = false; 
            	}
        }
 
        if (asc) System.out.println("Array is Sorted in Ascending Order"); 
        else if (desc) System.out.println("Array is Sorted in Descending Order"); 
        else System.out.println("Array is Not Sorted"); 
    } 
} 
 