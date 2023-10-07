// Create a function that finds how many prime numbers there are, up to the given integer.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q034_PrimeNumberCount {
    // Creating a function to find out whether the entered number is a prime number or not
    static boolean primeOrNot(int number) {
        boolean b = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                b = true;
                break;
            }
        }
        if (b) {
            return true; // true indicates that the entered number is prime
        } else {
            return false; // false indicates that the entered number isn't prime
        }
    }

    // Creating a function to count the number of prime numbers up to a given number
    static void primeNumberCount(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (primeOrNot(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("This is a program which prints out the number of prime numbers up to a given number.");
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        primeNumberCount(number);
    }
}
