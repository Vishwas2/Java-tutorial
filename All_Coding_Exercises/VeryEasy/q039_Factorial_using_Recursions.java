package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q039_Factorial_using_Recursions {
    // creating a recursive function to print out the factorial of a number
    static int recursiveFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the factorial of a number n using a recursive method.");
        System.out.println("Enter the number whose factorial you want to calculate : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = recursiveFactorial(input);
        System.out.println(result);
        scanner.close();
    }
}
