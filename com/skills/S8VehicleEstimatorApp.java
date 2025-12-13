package com.skills;
import java.util.Scanner;
// Base Vehicle class
abstract class Vehicle {
    protected String brand;
    protected double engineCC;     // engine displacement in cc
    protected double weightKg;     // kerb weight in kg
    protected int year;
    public Vehicle(String brand, double engineCC, double weightKg, int year) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.weightKg = weightKg;
        this.year = year;
    }
    // Estimated top speed (km/h)
    public abstract double estimateTopSpeed();
    // Estimated mileage/fuel efficiency (km/l)
    public abstract double estimateMileage();
    // Estimated total cost of ownership per year (currency units)
    public abstract double estimateAnnualCost();
    // Shared utility methods accessible to subclasses
    protected static double clamp(double v, double min, double max) {
        return Math.max(min, Math.min(max, v));
    }
    protected static double ageFactor(int year) {
        // Older vehicles depreciate less annually; baseline is 2025 here
        int age = Math.max(0, 2025 - year);
        return 0.12 * Math.max(1, 1 + (age - 5) * 0.02);
    }
    @Override
    public String toString() {
        return String.format("%s (%s, %.0fcc, %.0fkg, %d)",
                this.getClass().getSimpleName(), brand, engineCC, weightKg, year);
    }
}
// Car subclass
class Car extends Vehicle {
    private int seats;
    private boolean turbo;
    public Car(String brand, double engineCC, double weightKg, int year, int seats, boolean turbo) {
        super(brand, engineCC, weightKg, year);
        this.seats = seats;
        this.turbo = turbo;
    }
    @Override
    public double estimateTopSpeed() {
        double base = 90 + Math.sqrt(engineCC) * 1.6;
        if (turbo) base += 15;
        return clamp(base - (weightKg / 100.0) * 4.0, 80, 280);
    }
    @Override
    public double estimateMileage() {
        double base = 25.0 - (engineCC / 1000.0) * 4.0 - (weightKg / 1000.0) * 3.0;
        base += Math.max(0, 5 - seats) * 0.5;
        if (turbo) base -= 1.0;
        return clamp(base, 8, 28);
    }
    @Override
    public double estimateAnnualCost() {
        double depreciation = Math.max(30000, (engineCC / 1000.0) * 80000) * ageFactor(year);
        double maintenance = 15000 + (weightKg / 100.0) * 500 + (turbo ? 8000 : 0);
        double fuelCost = 120000 / Math.max(estimateMileage(), 1.0); // assume 12,000 km/year, Rs 100/l
        return depreciation + maintenance + fuelCost;
    }
}
// Bike subclass
class Bike extends Vehicle {
    private boolean sports;
    public Bike(String brand, double engineCC, double weightKg, int year, boolean sports) {
        super(brand, engineCC, weightKg, year);
        this.sports = sports;
    }
    @Override
    public double estimateTopSpeed() {
        double base = 70 + Math.sqrt(engineCC) * 2.2;
        if (sports) base += 20;
        base += Math.max(0, (150 - weightKg) / 10.0);
        return clamp(base, 60, 320);
    }
    @Override
    public double estimateMileage() {
        double base = 45.0 - (engineCC / 1000.0) * 15.0 - (weightKg - 150) / 100.0;
        if (sports) base -= 5.0;
        return clamp(base, 18, 70);
    }
    @Override
    public double estimateAnnualCost() {
        double depreciation = Math.max(10000, (engineCC / 1000.0) * 30000) * ageFactor(year);
        double maintenance = 6000 + (sports ? 5000 : 0);
        double fuelCost = 60000 / Math.max(estimateMileage(), 1.0); // assume 6,000 km/year, Rs 100/l
        return depreciation + maintenance + fuelCost;
    }
}
// Truck subclass
class Truck extends Vehicle {
    private double payloadTons;
    public Truck(String brand, double engineCC, double weightKg, int year, double payloadTons) {
        super(brand, engineCC, weightKg, year);
        this.payloadTons = payloadTons;
    }
    @Override
    public double estimateTopSpeed() {
        double base = 70 + Math.sqrt(engineCC) * 1.2 - payloadTons * 5.0 - (weightKg / 100.0) * 2.0;
        return clamp(base, 60, 140);
    }
    @Override
    public double estimateMileage() {
        double base = 8.0 - payloadTons * 0.8 - (engineCC / 1000.0) * 0.8 - (weightKg / 1000.0) * 0.5;
        return clamp(base, 3, 12);
    }
    @Override
    public double estimateAnnualCost() {
        double depreciation = Math.max(100000, (engineCC / 1000.0) * 200000) * ageFactor(year);
        double maintenance = 50000 + payloadTons * 8000;
        double fuelCost = 80000 / Math.max(estimateMileage(), 1.0); // assume 8,000 km/year, Rs 100/l
        return depreciation + maintenance + fuelCost;
    }
}
public class S8VehicleEstimatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vehicle Estimator");
        System.out.println("1) Car  2) Bike  3) Truck");
        System.out.print("Choose type (1-3): ");
        int choice = readInt(sc, 1, 3);
        System.out.print("Brand: ");
        String brand = sc.nextLine().trim();
        System.out.print("Engine (cc): ");
        double cc = readDouble(sc, 50, 20000);
        System.out.print("Kerb weight (kg): ");
        double weight = readDouble(sc, 50, 40000);
        System.out.print("Manufacturing year (e.g., 2021): ");
        int year = readInt(sc, 1980, 2025);
        Vehicle v;
        switch (choice) {
            case 1 -> {
                System.out.print("Seats: ");
                int seats = readInt(sc, 2, 9);
                System.out.print("Turbo (y/n): ");
                boolean turbo = readYesNo(sc);
                v = new Car(brand, cc, weight, year, seats, turbo);
            }
            case 2 -> {
                System.out.print("Is it a sports bike? (y/n): ");
                boolean sports = readYesNo(sc);
                v = new Bike(brand, cc, weight, year, sports);
            }
            case 3 -> {
                System.out.print("Payload capacity (tons): ");
                double payload = readDouble(sc, 0, 40);
                v = new Truck(brand, cc, weight, year, payload);
            }
            default -> throw new IllegalStateException("Unexpected choice");
        }
        System.out.println("\n--- Summary ---");
        System.out.println(v);
        double speed = v.estimateTopSpeed();
        double mileage = v.estimateMileage();
        double annualCost = v.estimateAnnualCost();
        System.out.printf("Estimated top speed: %.1f km/h%n", speed);
        System.out.printf("Estimated mileage: %.1f km/l%n", mileage);
        System.out.printf("Estimated annual ownership cost: Rs %.0f%n", annualCost);
        sc.close();
    }
    private static int readInt(Scanner sc, int min, int max) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                int v = Integer.parseInt(s);
                if (v < min || v > max) throw new NumberFormatException();
                return v;
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid integer (" + min + "-" + max + "): ");
            }
        }
    }
    private static double readDouble(Scanner sc, double min, double max) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                double v = Double.parseDouble(s);
                if (v < min || v > max) throw new NumberFormatException();
                return v;
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number (" + min + "-" + max + "): ");
            }
        }
    }
    private static boolean readYesNo(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("y") || s.equals("yes")) return true;
            if (s.equals("n") || s.equals("no")) return false;
            System.out.print("Please enter y/n: ");
        }
    }
}