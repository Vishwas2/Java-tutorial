// Create a function that will test if a string is a valid PIN or not via a regular expression.
// A valid PIN has:
//1. Exactly 4 or 6 characters.
//2. Only numeric characters (0-9).
//3. No whitespace.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q021_ValidatePIN {
    // Creating function to check whether string is a valid PIN or not
    static void checkPIN(String PIN) {
        // first checking the length of the string :
        if (PIN.length() != 4 && PIN.length() != 6) {
            System.out.println("The entered string is not a valid PIN.");
        }
        // trying to convert this string to integer (if we are able to convert it, it is a valid PIN) :
        try {
            int pin = Integer.parseInt(PIN);
            System.out.println("The entered string is a valid PIN.");
        } catch (Exception e) {
            System.out.println("The entered string is not a valid PIN");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether the entered string is a valid PIN or not.1+");
        System.out.println("Enter the PIN : ");
        Scanner scanner = new Scanner(System.in);
        String enteredPin = scanner.next();
        checkPIN(enteredPin);
        scanner.close();
    }
}
