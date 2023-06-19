package Day_012_Practice_Questions;
// Write a Java program to convert a string entered by user to lowercase

import java.util.Scanner;

public class PracticeQuestion11 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lowerCase = input.toLowerCase();
        System.out.println("The string converted to lowercase is : " + lowerCase);
        sc.close();
    }
}
