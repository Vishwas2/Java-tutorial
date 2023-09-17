package Exercises.All_Coding_Exercises.Medium;
// print out the following number pyramid pattern and take the number of rows as input from the user.
// for input 5:
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5

import java.util.Scanner;

public class q003_NumberPyramid {
    static void numberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // printing spaces:
            for (int k = rows - i; k > 0; k--) {
                System.out.print(" ");
            }
            // printing the numbers
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the number pyramid.");
        System.out.print("Enter the number of rows : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        numberPyramid(rows);
        scanner.close();
    }
}
