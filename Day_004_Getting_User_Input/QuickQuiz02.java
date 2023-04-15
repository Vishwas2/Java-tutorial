// Write a program to check whether the user input is an integer or not.

import java.util.Scanner;

public class QuickQuiz02 {
    public static void main(String[] args) {
        System.out.println("Checking whether the input entered by the user is an integer or not");
        System.out.println("Enter an integer :");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        // boolean will return true if the input is an integer otherwise it will return
        // false.
        System.out.println(b1);
        sc.close();
    }
}
