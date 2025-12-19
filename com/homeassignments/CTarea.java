package com.homeassignments;
import java.util.Scanner;
abstract class Shape{
    abstract double area();
}
class Circl extends Shape{
    double r;
    Circl(double r){this.r=r;}
    double area(){return Math.PI*r*r;}
}
class Triangle extends Shape{
    double b,h;
    Triangle(double b,double h){this.b=b;this.h=h;}
    double area(){return 0.5*b*h;}
}
public class CTarea{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.println("Enter radius:");
        double r=sc.nextDouble();
        Shape s1=new Circl(r);
        System.out.println(s1.area());
        System.out.println("Enter base and height:");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        Shape s2=new Triangle(b,h);
        System.out.println(s2.area());
        sc.close();
    }
}
