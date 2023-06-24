package Day_019_Practice_Questions;
// WAP to print factorial of a given number using for loop.

// the sign of factorial is !
// for example 3! = 1*2*3 = 6
// the factorial of 0 is 1

import java.util.Scanner;

public class PracticeQuestion25 {
    public static void main(String[] args) {
        System.out.println("This is a program to print out the factorial of a given number.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to print : ");
        int number = sc.nextInt();
        int product = 1;
        for (int i = number; i > 1; i--) {
            product = product * i;
        }
        System.out.println("The factorial of the given number is : " + product);
        sc.close();
    }
}
