// Create a function which checks if the input given by the user is the factorial of a number. Also print out that number.


// Approach used : I will calculate the factorial of all the numbers from 1 to until the number is less than or equal to factorial.
// If the factorial matches the given number, then it is a factorial otherwise not.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q027_IsInputFactorialOfANumber {

    // Creating a function calculate the factorial of a number :
    static int calculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    static void factorialCheck(int numberToCheck) {
        int num = 1;
        int factorial = 1;
        while (factorial <= numberToCheck) {
            factorial = calculateFactorial(num);
            if (factorial == numberToCheck) {
                System.out.println("This number is the factorial of " + num);
                break;
            }
            num++;
        }
        if (factorial != numberToCheck) {
            System.out.println("The given number is not the factorial of any number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program which checks if the input given by the user is the factorial of a number and print out that number.");
        System.out.println("Enter the number you want to check : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        factorialCheck(input);
        scanner.close();
    }
}
