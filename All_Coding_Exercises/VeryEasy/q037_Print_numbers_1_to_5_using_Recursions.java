package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q037_Print_numbers_1_to_5_using_Recursions {
    // creating a method to print out the numbers recursively
    static String numbersRecursivePrint(int startingNumber, int endNumber) {
        if (startingNumber == endNumber) {
            return startingNumber + " "; // base case
        }
        return startingNumber + " " + numbersRecursivePrint(startingNumber + 1, endNumber); // recursive call
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out numbers from the starting number entered by the user to the end number using recursion.");
        System.out.println("Enter the starting number : ");
        Scanner scanner = new Scanner(System.in);
        int startingNumber = scanner.nextInt();
        System.out.println("Enter the last number : ");
        int lastNumber = scanner.nextInt();
        String ans = numbersRecursivePrint(startingNumber, lastNumber);
        System.out.println(ans);
        scanner.close();
    }
}
