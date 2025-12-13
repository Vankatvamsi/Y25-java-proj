package com.homeassignments;
import java.util.*; 

public class HA4LargeAndSmall 
{ 
	public static void main(String[] args) 
	{ 
		int[] a = {5, 9, 1, 3, 7}; 
		Arrays.sort(a); 
		int secondSmallest = a[1]; 
		int secondLargest = a[a.length - 2]; 
		System.out.println("Second Smallest: " + secondSmallest); 
		System.out.println("Second Largest: " + secondLargest); 
	} 
}