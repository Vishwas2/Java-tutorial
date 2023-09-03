package VeryEasy;

import java.util.Scanner;

public class q027_Even_or_Odd {
    static void everOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number entered is even.");
        } else {
            System.out.println("The number entered is odd.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether the number entered is even or odd.");
        System.out.println("Enter the number you want to check : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        everOrOdd(input);
        scanner.close();
    }
}
