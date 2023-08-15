package Day_066_Syntax_Errors_Runtime_Errors_and_Logical_Errors;

import java.util.Scanner;

public class Day066 {
    public static void main(String[] args) {
        // LOGICAL ERROR DEMO :
        // Write a program to print all the prime numbers between to the number entered by the user(not inclusive)
        /*
        CORRECT CODE :
        System.out.println("This is a program to print out the prime numbers between 1 and the number entered by the user.");
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The prime numbers between 1 and " + input + " are :");
        for (int i = 1; i <= input; i++) {
            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                System.out.println(i);
            }
        }
        // The code given above is correct logically but if we had made some error in the logic of prime number then it would
        // have given the wrong output. (logical error)
        */

        // SYNTAX ERROR DEMO :
        // int a = 5 -> syntax error(no semicolon)
        // b = 6; -> syntax error (b not declared)

        // RUNTIME ERROR DEMO :
        /*
        int k ;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        System.out.println("Integer part of 1000 divided by k is : "+1000/k);
        // You might think that there is no problem in this code, but you don't know what input user will give.
        // This program will give error if you give input as 0
         */
    }
}
