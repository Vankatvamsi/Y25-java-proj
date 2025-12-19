package labs;


import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive function for fibonacci
    static int fib(int n) {
        if (n == 0) {
            return 0;   // Base case 1
        }
        if (n == 1) {
            return 1;   // Base case 2
        }
        return fib(n - 1) + fib(n - 2); // Recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

