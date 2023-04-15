// Write a Java program to detect whether the number entered by the user is integer or not.

import java.util.Scanner;

public class PracticeQuestion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer :");
        boolean b = sc.hasNextInt();
        System.out.println(b);
        sc.close();
    }
}
