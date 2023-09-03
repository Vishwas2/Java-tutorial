package VeryEasy;

import java.util.Scanner;

public class q028_Eligible_to_Vote {
    public static void eligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check weather a person is eligible to vote or not.");
        System.out.println("Please enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        eligibleToVote(age);
        scanner.close();
    }
}
