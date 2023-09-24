package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q038_SumOfFirstNNaturalNumbersUsingRecursion {
    // creating a recursive function to add all the natural numbers
    static int recursiveNaturalNumberSum(int length) {
        if (length == 1) {
            return 1;
        }
        return length + recursiveNaturalNumberSum(length - 1);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the sum of first n natural numbers using recursion.");
        System.out.println("Enter the number of natural numbers you want to add : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The sum of first " + input + " natural numbers is : " + recursiveNaturalNumberSum(input));
        scanner.close();
    }
}
