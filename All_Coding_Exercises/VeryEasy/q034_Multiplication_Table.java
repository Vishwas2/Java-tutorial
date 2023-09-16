package VeryEasy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q034_Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("This is a program to print out the multiplication table of the number entered by the user.");
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        int input = 0;
        while (b) {
            b = false;
            try {
                System.out.println("Enter the number whose multiplication table you want to print out : ");
                input = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid number. ");
                b = true;
                scanner.nextLine();
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + input + " = " + (i * input));
        }
        scanner.close();
    }
}
