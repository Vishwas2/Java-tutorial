package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

// use method to print out the butterfly pattern take input from the user on how many rows he wants in the pattern
// for input 8 :
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
public class q001_ButterflyPattern {
    static void butterflyPattern(int rows){
        // first we will print out the upper half of the pattern
        for (int i = 1;i<=rows/2;i++){
            // printing the first stars
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            // printing the spaces
            for (int k = 1;k<=rows-(i+i);k++){
                System.out.print(" ");
            }
            // printing the second stars
            for (int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // printing the lower half of the pattern :
        for (int i =0;i<rows/2;i++){
            for (int j = i;j<rows/2;j++){
                System.out.print("*");
            }
            // printing the spaces
            for (int k = i+i;k>0;k--){
                System.out.print(" ");
            }
            for (int l = i;l<rows/2;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("This is a program to print out the butterfly pattern .");
        System.out.println("Enter the number of rows you want in the pattern : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        butterflyPattern(rows);
        scanner.close();
    }
}
