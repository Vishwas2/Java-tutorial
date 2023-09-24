package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q040_FibonacciSeriesUsingRecursion {
    // creating a recursive function to print out the fibonacci sequence
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the fibonacci series using recursion.");
        System.out.println("Enter the number of Fibonacci sequence numbers you want to print out : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
}
