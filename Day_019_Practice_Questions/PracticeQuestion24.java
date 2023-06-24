package Day_019_Practice_Questions;
// WAP to print the multiplication table of a given number n upto 10.

import java.util.Scanner;

public class PracticeQuestion24 {
    public static void main(String[] args) {
        System.out.println("Enter the number whose multiplication table you want to print out :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The multiplication table of " + num + (" is :"));
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        sc.close();
    }
}
