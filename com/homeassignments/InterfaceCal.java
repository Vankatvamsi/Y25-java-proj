package com.homeassignments;
import java.util.Scanner;
interface Calculator{
    double calculate(double x,double y);
}
class ScientificCalculator implements Calculator{
    public double calculate(double x,double y){
        return Math.pow(x,y);
    }
}
class FinancialCalculator implements Calculator{
    public double calculate(double x,double y){
        return x*y/100;
    }
}
public class InterfaceCal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.println("1. Scientific  2. Financial");
        int ch=sc.nextInt();
        System.out.println("Enter x and y:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        Calculator c;
        if(ch==1) c=new ScientificCalculator();
        else c=new FinancialCalculator();
        System.out.println(c.calculate(x,y));
        sc.close();
    }
} 
