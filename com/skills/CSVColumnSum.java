package com.skills;
import java.io.File;
import java.util.Scanner;
public class CSVColumnSum {
    public static void main(String[] args) {
    	System.out.println("Id no: 2500031933");
        File file = new File("sales.csv");
        double sum = 0;
        int rowCount = 0;
        int columnIndex = 1; 
        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); 
            }           
            while (scanner.hasNextLine()) {
                String[] columns = scanner.nextLine().split(",");
                if (columns.length > columnIndex) {
                    try {
                        sum += Double.parseDouble(columns[columnIndex].trim());
                        rowCount++;
                    } catch (NumberFormatException e) {                      
                    }
                }
            }
            System.out.printf("Column %d Sum: %.2f%n", columnIndex + 1, sum);
            System.out.printf("Rows processed: %d%n", rowCount);           
        } catch (Exception e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}