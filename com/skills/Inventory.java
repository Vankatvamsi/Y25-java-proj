package com.skills;
import java.util.Scanner;
public class Inventory {
    private String name;
    private double price;
    private int quantity;
    Inventory(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalValue() {
        return price * quantity;
    }
    void display() {
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: " + getTotalValue());
        System.out.println();
    }
    public static void main(String[] args) {
    	System.out.println("ID no: 2500031933");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();
        Inventory[] items = new Inventory[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            items[i] = new Inventory(name, price, quantity);
        }
        System.out.println("\n--- Inventory Details ---");
        for (Inventory item : items) {
            item.display();
        }
        sc.close();
    }
}