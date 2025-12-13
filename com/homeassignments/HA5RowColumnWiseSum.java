package com.homeassignments;

public class HA5RowColumnWiseSum 
{     
public static void main(String[] args) 
{ 
		int[][]A={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < A.length; i++) {             
        	int rowSum = 0;            
        	for (int j = 0; j < A[0].length; j++) {                 
        	rowSum += A[i][j]; 
            } 
            System.out.println("Row " + (i+1) + " Sum = " + rowSum); 
        } 
	        for (int j = 0; j < A[0].length; j++) 
	        {            
	        	int colSum = 0;             
	        	for (int i = 0; i < A.length; i++) 
	        	{                 
        		colSum += A[i][j]; 
            } 
            System.out.println("Column " + (j+1) + " Sum = " + colSum); 
        } 
    } 
} 
