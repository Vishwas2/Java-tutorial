package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

// Print the diamond pattern using method in Java. Take the number of rows as input from the user.
// For input 8:
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
public class q005_DiamondPattern {
    static void diamondPattern(int rows) {
        // printing the upper-half of the pattern
        int num = 1;
        for (int i = 1; i <= rows / 2; i++) {
            // printing spaces before stars
            for (int j = (rows / 2) - i; j > 0; j--) {
                System.out.print(" ");
            }
            // printing stars
            for (int k = num; k > 0; k--) {
                System.out.print("*");
            }
            num = num + 2;
            // printing spaces after stars
            for (int l = (rows / 2) - i; l > 0; l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // printing the lower-half of the pattern
        for (int i = 1; i <= rows / 2; i++) {
            // printing spaces before stars
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            // printing the stars
            for (int k = rows - (i + i) + 2; k > 1; k--) {
                System.out.print("*");
            }
            // printing spaces after stars
            for (int l = i - 1; l > 0; l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the diamond pattern.");
        System.out.println("Enter the number of rows : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        diamondPattern(rows);
        scanner.close();
    }
}
