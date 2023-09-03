package VeryEasy;

import java.util.Scanner;

public class q024_Reversing_a_String {
    public static void stringReverse(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to reverse the string entered by the user :");
        System.out.println("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        stringReverse(string);
        scanner.close();
    }
}
