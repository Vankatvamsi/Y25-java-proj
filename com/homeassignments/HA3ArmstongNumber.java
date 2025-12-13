package com.homeassignments;

public class HA3ArmstongNumber 
{ 
    public static void main(String[] args)
    { 
        int sum = 0,result,temp; 
        int num = 153; 
        temp = num; 
        while( num > 0 ){ 
            result = num % 10; 
            num = num / 10 ; 
            sum = sum + (result*result*result); 
        } 
        if (temp == sum){ 
            System.out.println(temp+ " is armstrong number"); 
        } 
        else{ 
            System.out.println(temp+ " is not a armstrong number"); 
        } 
    }
}