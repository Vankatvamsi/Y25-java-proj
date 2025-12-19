package labs;


import java.util.Scanner;

public class RecursiveFactorial {

    // Recursive function to find factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // Base condition
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = factorial(num);

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

