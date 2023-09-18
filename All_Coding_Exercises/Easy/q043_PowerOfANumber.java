package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q043_PowerOfANumber {
    public static void main(String[] args) {
        System.out.println("This is a program which takes in two numbers as input (one base and one power) and prints out the result.");
        System.out.println("Enter the base number : ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("Enter the power of the base number : ");
        int power = scanner.nextInt();
        System.out.println("The result is : " + Math.pow(base, power));
        scanner.close();
    }
}
