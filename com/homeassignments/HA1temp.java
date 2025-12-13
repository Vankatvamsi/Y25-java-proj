package com.homeassignments;
import java.util.Scanner;
class conversion{
	float temp,result;
	float celtofar(float temp)
	{
		result=( temp* 9/5) + 32;
		return result;
	}
	float celtokel(float temp)
	{
		result=temp+ 273.15f;
		return result;
	}
	float fartocel(float temp)
	{
		result=(temp - 32) * 5/9;
		return result;
	}
	float fartokel(float temp)
	{
		result=(temp - 32) * 5/9 + 273.15f;
		return result;
	}
	float keltocel(float temp)
	{
		result=temp - 273.15f;
		return result;
	}
	float keltofar(float temp)
	{
		result=(temp - 273.15f) * 9/5 + 32;
		return result;
	}
}
public class HA1temp 
{	
	public static void main(String[] args) 
	{
		float temp,c,f,k,result;
		int s;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter what you want to do: ");
		System.out.println("1) for Celcius to Fahrenheit");
		System.out.println("2) for Celcius to kelvin");
		System.out.println("3) for Fahrenheit to calvin");
		System.out.println("4) for Fahrenheit to kalvin");
		System.out.println("5) for kelvin to celcius");
		System.out.println("6) for kelvin to Fahrenheit");
		s=s1.nextInt();
		 System.out.print("Enter temperature value: ");
	         temp = s1.nextFloat();
	         conversion c1=new conversion();
		switch (s) 
		{
			default:
			{
				System.out.println("Enter something logical");
				break;
				}
			case 1:
				result = c1.celtofar(temp);
				{
					System.out.println("for Celcius to Fahrenheit");
					System.out.println("Result: "+result);
					break;
				}
			case 2:
				result = c1.celtokel(temp);
				{
					System.out.println("for Celcius to kelvin");
					System.out.println("Result: "+result);
					break;
				}
			case 3:
				result = c1.fartocel(temp);
				{
					System.out.println(" for Fahrenheit to calvin");
					System.out.println("Result: "+result);
					break;
				}
			case 4:
				result = c1.fartokel(temp);
				{
					System.out.println("for Fahrenheit to kalvin");
					System.out.println("Result: "+result);
					break;
					}
			case 5:
				result = c1.keltocel(temp);
				{
					System.out.println("for kelvin to celcius");
					System.out.println("Result: "+result);
					break;
				}
			case 6:
				result = c1.keltofar(temp);
				{
					System.out.println("for kelvin to Fahrenheit");
					System.out.println("Result: "+result);
					break;
				}
		}
	}

}
