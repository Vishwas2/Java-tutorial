package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q016_RecursiveStringReverse {
    // Creating a recursive function to reverse a string
    static String recursiveStringReverse(String input) {
        if (input.isEmpty() || input.length() == 1) {
            return input;
        }
        return recursiveStringReverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to reverse a string in java using a recursive function.");
        System.out.println("Enter the string you want to reverse : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = recursiveStringReverse(input);
        System.out.println(result);
        scanner.close();
    }
}
