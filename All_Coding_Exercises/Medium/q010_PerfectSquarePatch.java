// Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
// For example:
// squarePatch(3) ➞ [
//  [3, 3, 3],
//  [3, 3, 3],
//  [3, 3, 3]]

package Exercises.All_Coding_Exercises.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class q010_PerfectSquarePatch {
    public static void squarePatch(int number) {
        int[][] arr = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                arr[i][j] = number;
            }
        }
        // printing the array :
        for (int i = 0; i < number; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program which takes in a number n and prints out a matrix with n rows and columns, also every element of the matrix is n.");
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        squarePatch(number);
        scanner.close();
    }
}
