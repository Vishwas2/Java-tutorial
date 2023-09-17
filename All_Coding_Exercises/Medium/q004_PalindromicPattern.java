package Exercises.All_Coding_Exercises.Medium;

// Print the following pattern using method in java. Take the number of rows as input from the user
// For input 5:
//    1
//   212
//  32123
// 4321234
//543212345

import java.util.Scanner;

public class q004_PalindromicPattern {
    static void palindromicPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // printing spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // printing numbers upto 1
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            // printing numbers after 1
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the palindromic number pattern.");
        System.out.print("Enter the number of rows : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        palindromicPattern(rows);
        scanner.close();
    }
}
