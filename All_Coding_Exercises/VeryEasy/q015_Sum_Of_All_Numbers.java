package VeryEasy;

import java.util.Scanner;

public class q015_Sum_Of_All_Numbers {
    public static void main(String[] args) {
        System.out.println("This is a program that keeps on taking input from the user until 0 is entered." +
                " Then it prints out the sum of all the numbers entered by the user");
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        System.out.println("Please enter the numbers you want to add :");
        int sum = 0;
        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
        }
        System.out.println("The sum of the numbers entered is : " + sum);
        scanner.close();
    }
}