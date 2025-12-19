package com.skills;
import java.io.*;
import java.util.*;
public class ReadAndAverage {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        double sum = 0;
        int count = 0;
        System.out.println("ID no: 2500031933");;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextDouble()) {
                sum += sc.nextDouble();
                count++;
            }
            if (count > 0)
                System.out.println("Average = " + (sum / count));
            else
                System.out.println("No numeric data found.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }  
    }
}