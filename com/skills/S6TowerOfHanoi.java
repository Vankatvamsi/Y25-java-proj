package com.skills;
import java.util.Scanner;

public class S6TowerOfHanoi {
    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');  // A = source, C = destination, B = auxiliary
        sc.close();
    }
}

