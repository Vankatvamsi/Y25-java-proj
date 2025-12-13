package com.skills;

class InventoryItem {
private String name;
private double price;
private int quantity;
public InventoryItem(String name, double price, int quantity) {
this.name = name;
this.price = price;
this.quantity = quantity;
}
public double getTotalValue() {
return price * quantity;
}
public void display() {
System.out.println("Item: " + name);
System.out.println("Price: " + price);
System.out.println("Quantity: " + quantity);
System.out.println("Total Value: " + getTotalValue());
}
       }
public class S7InventoryItem {
public static void main(String[] args) {
InventoryItem item = new InventoryItem("Laptop", 55000, 3);
item.display();
}
       }
