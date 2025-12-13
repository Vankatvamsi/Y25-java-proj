// Abstract class for 2D shapes
package com.skills;
abstract class Shape2D {
    protected String color;
    public Shape2D(String color) {
        this.color = color;
    }
    public abstract double area();
    public abstract double perimeter();
    public String getColor() {
        return color;
    }
}
// Interface for 3D shapes
interface Shape3D {
    double volume();
    double surfaceArea();
}
// Circle (2D only)
class Circle extends Shape2D {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
// Rectangle (2D only)
class Rectangle extends Shape2D {
    private double length, width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
// Sphere (Hybrid: 2D + 3D)
class Sphere extends Shape2D implements Shape3D {
    private double radius;
    public Sphere(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        // Projected area (circle cross-section)
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        // Circumference of great circle
        return 2 * Math.PI * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
// Cube (Hybrid: 2D + 3D)
class Cube extends Shape2D implements Shape3D {
    private double side;
    public Cube(String color, double side) {
        super(color);
        this.side = side;
    }
    @Override
    public double area() {
        // Projected area (square face)
        return side * side;
    }
    @Override
    public double perimeter() {
        // Perimeter of one face
        return 4 * side;
    }
    @Override
    public double volume() {
        return side * side * side;
    }
    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }
}
// Demo
public class S8ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);
        Sphere s = new Sphere("Green", 3);
        Cube cube = new Cube("Yellow", 2);
        System.out.println("Circle area: " + c.area() + ", perimeter: " + c.perimeter());
        System.out.println("Rectangle area: " + r.area() + ", perimeter: " + r.perimeter());
        System.out.println("Sphere volume: " + s.volume() + ", surface area: " + s.surfaceArea());
        System.out.println("Cube volume: " + cube.volume() + ", surface area: " + cube.surfaceArea());
    }
}