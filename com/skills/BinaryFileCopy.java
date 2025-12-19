package com.skills;
import java.io.*;
import java.time.Duration;
import java.time.Instant;
public class BinaryFileCopy {
    public static void main(String[] args) {
    	System.out.println("Id no: 2500031933");
        String source = "input.bin";  
        String dest = "output.bin";  
        long bufferedTime = copyWithBuffer(source, dest + "_buffered");
        System.out.printf("Buffered copy: %d ms%n", bufferedTime); 
        long normalTime = copyNormal(source, dest + "_normal");
        System.out.printf("Normal copy: %d ms%n", normalTime);
    }    
    static long copyWithBuffer(String src, String dest) {
        Instant start = Instant.now();
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest))) {        	
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Duration.between(start, Instant.now()).toMillis();
    }    
    static long copyNormal(String src, String dest) {
        Instant start = Instant.now();
        try (FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(dest)) {            
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Duration.between(start, Instant.now()).toMillis();
    }
}