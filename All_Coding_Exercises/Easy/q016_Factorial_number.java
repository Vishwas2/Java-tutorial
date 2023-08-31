// Create a function to print out the factorial of the number passed.
package easy;

import java.util.Scanner;

public class q016_Factorial_number {
    static void factorial(int number) {
        int multiple = 0;
        int total = 1;
        while (number > 1) {
            multiple = number * (number - 1);
            total = total * multiple;
            number = number - 2;
        }
        System.out.println("The factorial of the number is : " + total);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the factorial of a given number.");
        System.out.println("Enter the number whose factorial you want to calculate :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        factorial(input);
        scanner.close();
    }
}
