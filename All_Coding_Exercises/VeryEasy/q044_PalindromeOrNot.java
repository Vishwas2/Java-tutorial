// write a program to check whether the number entered by the user is palindrome or not.

package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q044_PalindromeOrNot {
    // Creating a number which returns true if the number entered by the user is palindrome false otherwise
    static boolean palindromeCheck(int number) {
        // a palindrome number is one which is the same from both the sides
        if (number < 0) {
            return false;
        }
        // Typecasting the integer as string and reversing it :
        String originalNumber = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(originalNumber).reverse();
        String reversedString = stringBuilder.toString();
        int reversed = Integer.parseInt(reversedString);
        if (reversed == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether the number entered is ");
        System.out.println("Enter the number you want to check : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (palindromeCheck(input)) {
            System.out.println("The entered number is palindrome.");
        } else {
            System.out.println("The entered number is not palindrome.");
        }
    }
}
