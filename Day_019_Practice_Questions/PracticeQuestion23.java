package Day_019_Practice_Questions;
// WAP to print out the sum of the first n even numbers using while loop.

import java.util.Scanner;

public class PracticeQuestion23 {
    public static void main(String[] args) {
        System.out.println("Program to print out the sum of the first n even numbers.");
        System.out.println("Enter how many numbers do you want to add : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = input;
        int n = 2;
        int evenSum = 0;
        while (input > 0) {
            evenSum = evenSum + n;
            input--;
            n = n + 2;
        }
        System.out.println("The sum of first " + count + (" even numbers is : " + evenSum));
        sc.close();
    }
}
