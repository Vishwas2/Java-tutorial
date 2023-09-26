package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

// write a function in java to print out the following pattern : (for length = 4)
//   *
//  **
// ***
//****
public class q047_PatternPrinting {
    static void starPattern(int length) {
        for (int i = 1; i <= length; i++) {
            // printing spaces :
            for (int j = length - i; j > 0; j--) {
                System.out.print(" ");
            }
            // printing stars :
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            // going to the next line :
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the given pattern using a method.");
        System.out.println("Enter the length of the star pattern : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("The pattern is : ");
        starPattern(length);
        scanner.close();
    }
}
