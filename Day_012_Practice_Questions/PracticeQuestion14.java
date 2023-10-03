package Day_012_Practice_Questions;
// Write a program to detect double and triple spaces in a string

import java.util.Scanner;

public class PracticeQuestion14 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        // if double or triple spaces does not exist then we will get -1
        sc.close();
        ;
    }
}
