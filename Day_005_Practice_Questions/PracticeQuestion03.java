// Write a Java program which asks the user to enter their name and greets them with "Hello <name>, have a good day." text.

import java.util.Scanner;

public class PracticeQuestion03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day.");
        sc.close();
    }
}