// Create a function that takes two strings as input and prints out the sum as string.

package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q050_Two_String_Sum {
    // Creating the function to add two strings :
    static void twoStringSum(String firstString, String secondString) {
        int firstNumber = Integer.parseInt(firstString);
        int secondNumber = Integer.parseInt(secondString);
        int sum = firstNumber + secondNumber;
        String result = String.valueOf(sum);
        System.out.println("The sum of the two numbers is : " + result);
    }

    public static void main(String[] args) {
        System.out.println("This is a program that takes two numbers as input and prints out the sum as string.");
        System.out.println("Enter the first number : ");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.next();
        System.out.println("Enter the second number : ");
        String secondNumber = scanner.next();
        twoStringSum(firstNumber, secondNumber);
        scanner.close();
    }
}
