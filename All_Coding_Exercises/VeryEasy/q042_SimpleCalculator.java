// Write a program to create a simple calculator that takes two numbers and the operator as input from the user.

package Exercises.All_Coding_Exercises.VeryEasy;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class q042_SimpleCalculator {
    // creating a simple calculator method to perform the operations :
    static void simpleCalculator(int firstNumber, int secondNumber, char operator) {
        if (operator == '+') {
            System.out.println("The sum of the two numbers is : " + (firstNumber + secondNumber));
        } else if (operator == '-') {
            System.out.println("The difference between the two numbers is : " + (firstNumber - secondNumber));
        } else if (operator == '*') {
            System.out.println("The product of the two numbers is : " + (firstNumber * secondNumber));
        } else if (operator == '/') {
            System.out.println("The quotient is : " + (firstNumber / secondNumber));
        } else if (operator == '%') {
            System.out.println("The remainder is : " + (firstNumber % secondNumber));
        } else {
            System.out.println("Please enter a valid operator.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a simple calculator that takes two numbers and the operator as input from the user and prints out the result.");
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
            b = false;
            System.out.println("Enter the first number : ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number : ");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter the operator (+ for addition), (- for subtraction), (* for multiplication), (/ for division) and (% for remainder) : ");
            char operator = scanner.next().charAt(0);
            simpleCalculator(firstNumber, secondNumber, operator);
            System.out.println("Do you want to do more calculation ? (n/y) :");
            String response = scanner.next();
            if (response.equalsIgnoreCase("y")) {
                b = true;
            }
        }
        scanner.close();
    }
}
