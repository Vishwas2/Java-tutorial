//A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines
// whether a number is a Harshad or not.

package Exercises.All_Coding_Exercises.Medium;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class q028_HarshadNumber {
    // Creating a function to check whether the number entered is a Harshad number :
    static void checkHarshadNumber(int number) {
        int originalNumber = number;
        // now we will add all the digits of the number
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }
        // Checking if the sum of all the digits exactly divides the original number
        if (originalNumber % sum == 0) {
            System.out.println("The entered number is a Harshad number.");
        } else {
            System.out.println("The entered number is not a Harshad number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether the number entered by the user is Harshad number or not.");
        System.out.println("Enter the number you want to check : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        checkHarshadNumber(input);
        scanner.close();
    }
}
