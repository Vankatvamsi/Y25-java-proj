package com.skills;
import java.util.*;
import java.util.stream.*;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID no: 2500031933");
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        Map<String, Long> freq = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(freq);
        sc.close();
    }
}
