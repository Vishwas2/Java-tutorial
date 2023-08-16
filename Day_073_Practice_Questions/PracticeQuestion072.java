package Day_073_Practice_Questions;
// Write a Java program that prints "Haha" during arithmetic exception and "Hehe" during illegal argument exception.

import java.util.Scanner;

public class PracticeQuestion072 {
    public static void main(String[] args) {
        try {
            System.out.println("This is a program to divide two numbers.");
            System.out.println("Enter the first number :");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number : ");
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        } catch (Exception e) {
            System.out.println("We have encountered an exception.");
        }
    }
}
