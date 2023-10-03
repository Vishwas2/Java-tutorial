// Given a positive integer n and if 1 plus 2 times n exactly divides 1 plus 2 raised to the power n, then n is said to be a Curzon number.
//Write a function that determines whether a number is a Curzon number or not.
// 5 is a Curzon number since 11 completely divides 33
package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q026_CurzonNumber {
    // Creating a function to check whether the number is a Curzon number or not
    static void curzonNumberCheck(int number) {
        double dividend = 1 + (Math.pow(2, number));
        double divisor = 1 + (2 * number);
        if (dividend % divisor == 0) {
            System.out.println("The entered number is a Curzon number.");
        } else {
            System.out.println("The entered number is not a Curzon number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program which checks whether the number entered by the user is a Curzon number or not.");
        System.out.println("Enter the number you want to check : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        curzonNumberCheck(input);
        scanner.close();
    }
}
