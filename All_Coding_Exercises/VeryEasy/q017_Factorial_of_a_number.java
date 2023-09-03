package VeryEasy;

import java.util.Scanner;

public class q017_Factorial_of_a_number {
    public static int factorial(int number) {
        int product = 1;
        while (number > 1) {
            product = product * number;
            number--;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the factorial of the number entered by the user.");
        System.out.println("Enter the number whose factorial you want to calculate :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));
        scanner.close();
    }
}
