package com.skills;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
// A sample class to inspect
class Sample {
    private int id;
    public String name;
    public Sample() {}
    public Sample(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    private void secretMethod() {
        System.out.println("This is a private method!");
    }
}
public class S8ReflectionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fully qualified class name (e.g., Sample): ");
        String className = sc.nextLine();
        try {
            // Load class dynamically
            Class<?> cls = Class.forName(className);
            System.out.println("\n--- Class Info ---");
            System.out.println("Class: " + cls.getName());
            // Fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println("  " + f);
            }
            // Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println("  " + c);
            }
            // Methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("  " + m);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
        sc.close();
    }
}