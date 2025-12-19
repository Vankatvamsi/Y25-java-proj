package com.skills;

import java.io.*;

public class S9AverageFromFile {
    public static void main(String[] args) throws Exception {

        // Nested try for file reading
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
                String line;
                System.out.println("File Content:");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println("File not found.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}