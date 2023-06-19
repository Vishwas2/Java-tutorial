package Day_012_Practice_Questions;
// Write a java program to replace spaces with underscore.

import java.util.Scanner;

public class PracticeQuestion12 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String modifiedString = input.replace(' ', '_');
        System.out.println("The string after replacing spaces with underscores is : " + modifiedString);
        sc.close();
    }
}
