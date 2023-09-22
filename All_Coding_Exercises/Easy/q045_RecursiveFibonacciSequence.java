package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q045_RecursiveFibonacciSequence {
    // Creating a recursive method to print out the fibonacci sequence at a given position
    static int recursiveFibonacci(int position) {
        if (position <= 1) {
            return position;
        }
        return recursiveFibonacci(position - 1) + recursiveFibonacci(position - 2);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the fibonacci sequence using a recursive method.");
        // To do this first we will create a method to print out the number of the fibonacci sequence at a given position
        // Now that we have created a recursive method to print out the fibonacci number at a given position, we can use a loop to print all the numbers
        System.out.println("Enter the number of fibonacci sequence numbers you want to print out : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print(recursiveFibonacci(i) + " ");
        }
    }
}