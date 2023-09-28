// Floyd's triangle for rows 4 :
// 1
// 2 3
// 4 5 6
// 7 8 9 10

package Exercises.All_Coding_Exercises.VeryEasy;

import java.util.Scanner;

public class q043_FloydsTriangle {
    // Creating a method to print out the Floyd's Triangle
    static void floydTriangle(int numberOfRows) {
        int num = 1;
        for (int i = 0; i <= numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the Floyd's Triangle.");
        System.out.println("Enter the number of rows you want in the triangle : ");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();
        floydTriangle(numberOfRows);
        scanner.close();
    }
}
