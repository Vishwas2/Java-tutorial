package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q041_Power_Of_a_number_using_Recursion {
    // creating a recursive function to calculate the power of a number
    static int recursivePower(int baseNumber, int power) {
        if (power == 0) {
            return 1;
        }
        return baseNumber * recursivePower(baseNumber, power - 1);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the power of a given number using recursion.");
        System.out.println("Enter the base number : ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("Enter the power of the number : ");
        int power = scanner.nextInt();
        int result = recursivePower(base, power);
        System.out.println(result);
        scanner.close();
    }
}
