// Write a program to take 3 numbers as input from the user and display their sum.

import java.util.Scanner;

public class PracticeQuestion01 {
    public static void main(String[] args) {
        System.out.println("Program to calculate sum of 3 numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number :");
        float num2 = sc.nextFloat();
        System.out.println("Enter the third number :");
        float num3 = sc.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.println("The sum of the 3 numbers is :");
        System.out.println(sum);
        sc.close();
    }
}