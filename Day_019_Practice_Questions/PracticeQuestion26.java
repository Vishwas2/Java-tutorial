package Day_019_Practice_Questions;
// WAP to print factorial of a given number (this time using while loop)

import java.util.Scanner;

public class PracticeQuestion26 {
    public static void main(String[] args) {
        System.out.println("This is a program to print out the factorial of a given number.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to print : ");
        int number = sc.nextInt();
        int product = 1;
        while (number > 0) {
            product = product * number;
            number--;
        }
        System.out.println("The factorial of the given number is : " + product);
        sc.close();
    }
}
