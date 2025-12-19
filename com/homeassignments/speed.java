package com.homeassignments;
import java.util.Scanner;
public class speed {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("ID no: 2500032048");
 System.out.println("Speed-Time-Distance Calculator");
 System.out.println("1. Find Speed");
 System.out.println("2. Find Distance");
 System.out.println("3. Find Time");
 System.out.print("Enter your choice: ");
 int choice = sc.nextInt();

 double speed, distance, time;

 switch (choice) {
 case 1:
 System.out.print("Enter Distance (in km): ");
 distance = sc.nextDouble();
 System.out.print("Enter Time (in hours): ");
 time = sc.nextDouble();
 speed = distance / time;
 System.out.println("Speed = " + speed + " km/h");
 break;
 case 2:
 System.out.print("Enter Speed (in km/h): ");
 speed = sc.nextDouble();
 System.out.print("Enter Time (in hours): ");
 time = sc.nextDouble();
 distance = speed * time;
 System.out.println("Distance = " + distance + " km");
 break;
 case 3:
 System.out.print("Enter Distance (in km): ");
 distance = sc.nextDouble();
 System.out.print("Enter Speed (in km/h): ");
 speed = sc.nextDouble();
 time = distance / speed;
 System.out.println("Time = " + time + " hours");
 break;
 default:
 System.out.println("Invalid choice!");
 }
 }
}