package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

// print the following type of pattern. for input 3 :
//   ***
//  ***
// ***
// in the above pattern, the number of rows is 3 and each row has 3 stars.
public class q002_ParallelogramPattern {
    static void parallelogramPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // printing spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the parallelogram pattern in Java.");
        System.out.println("Enter the number of rows you want in the parallelogram pattern : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        parallelogramPattern(rows);
        scanner.close();
    }
}
