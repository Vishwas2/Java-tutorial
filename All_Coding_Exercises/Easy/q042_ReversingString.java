package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q042_ReversingString {
    public static void main(String[] args) {
        System.out.println("This is a program to reverse a String in Java.");
        System.out.println("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("The reversed string is : " + reverse);
        scanner.close();
    }
}
