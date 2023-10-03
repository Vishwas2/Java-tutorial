package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q051_IterativeAndRecursiveFactorial {
    // recursive function :
    static int recursiveFactorial(int number) {
        int multiple = 1;
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }

    // Iterative function :
    static void iterativeFactorial(int number) {
        int multiple = 1;
        while (number > 1) {
            multiple = multiple * number;
            number--;
        }
        System.out.println("The factorial using iterative approach is : " + multiple);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the factorial of a number using recursive and iterative approach.");
        System.out.println("Enter the number whose factorial you want to calculate : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Factorial using recursive approach : " + recursiveFactorial(number));
        iterativeFactorial(number);
        scanner.close();
    }
}
