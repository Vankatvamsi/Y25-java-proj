package com.homeassignments;
import java.util.Scanner;

abstract class Shape {
    abstract double area();
}
class Circle1 extends Shape {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return 0.5 * base * height;
    }
}
public class HA8AbstractClassShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape circle = new Circle1(r);
        System.out.println("Area of Circle: " + circle.area());

        System.out.print("Enter base of triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();
        Shape triangle = new Triangle(b, h);
        System.out.println("Area of Triangle: " + triangle.area());

        sc.close();
    }
}
