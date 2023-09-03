package VeryEasy;


import java.util.Scanner;

public class q029_Sum_of_numbers_using_Varargs {
    public static void sum(int... arr) {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("The sum of the numbers is : " + sum);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the sum of the numbers entered by the user using varargs.");
        System.out.println("Enter the fist number : ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = scanner.nextInt();
        sum(firstNumber, secondNumber);
        scanner.close();
    }
}
