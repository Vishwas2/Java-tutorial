package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q037_Prime_or_not {
    static void primeOrNot(int number) {
        int count = 0;
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("The number is not prime.");
        } else {
            System.out.println("It is a prime number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether the number entered by the user is prime or not .");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int input = scanner.nextInt();
        primeOrNot(input);
        scanner.close();
    }
}
