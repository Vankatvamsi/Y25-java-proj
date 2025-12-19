package labs;


import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract void area();   // abstract method
}

// Circle subclass
class Circle extends Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

// Triangle subclass
class Triangle extends Shape {

    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void area() {
        double a = 0.5 * base * height;
        System.out.println("Area of Triangle = " + a);
    }
}

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.area();

        System.out.print("Enter base of triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double h = sc.nextDouble();

        Triangle t = new Triangle(b, h);
        t.area();
    }
}
