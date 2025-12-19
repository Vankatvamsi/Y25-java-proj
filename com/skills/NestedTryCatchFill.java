package com.skills;
import java.io.*;
import java.util.Scanner;
public class NestedTryCatchFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");        
        while (true) {       	
            System.out.print("Enter filename to read: ");
            String filename = sc.nextLine().trim();           
            try {              
                if (filename.isEmpty()) {
                    throw new IllegalArgumentException("Filename cannot be empty");
                }               
                File file = new File(filename);
                if (!file.exists()) {
                    throw new FileNotFoundException(filename + " not found");
                }               
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    double sum = 0;
                    int count = 0;                    
                    String line;
                    while ((line = reader.readLine()) != null) {                    
                        try {
                            double num = Double.parseDouble(line.trim());
                            if (num < 0) throw new NumberFormatException("Negative number");
                            sum += num;
                            count++;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number skipped: " + line);
                        }
                    }
                    try (PrintWriter out = new PrintWriter(new FileWriter("result.txt"))) {
                        out.printf("File: %s%n", filename);
                        out.printf("Valid numbers: %d%n", count);
                        out.printf("Sum: %.2f%n", sum);
                        out.printf("Average: %.2f%n", count > 0 ? sum / count : 0);
                        System.out.println("✓ Success! Check result.txt");
                        break;
                        
                    } catch (IOException writeErr) {
                        System.err.println("✗ Write error: " + writeErr.getMessage());
                    }
                    
                } catch (IOException readErr) {
                    System.err.println("✗ Read error: " + readErr.getMessage());
                }
                
            } catch (IllegalArgumentException | FileNotFoundException e) {
                System.err.println("✗ Input error: " + e.getMessage());
            }
        }
        sc.close();
    }
}