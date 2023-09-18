// WAP to take two numbers as input from the user (number, length) and print the table of the number from 1 until length is reached.
// for example : arrayOfMultiples(7,5) -> [7,14,21,28,35]

package Exercises.All_Coding_Exercises.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class q008_ArrayOfMultiples {
    public static void arrayOfMultiples(int number, int position) {
        int[] arr = new int[position];
        for (int i = 0; i < position; i++) {
            arr[i] = number * (i + 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the table of a number upto a specific position");
        System.out.println("Enter the number whose multiple you want to print out : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter the position upto which you want to print the table of the number : ");
        int position = scanner.nextInt();
        arrayOfMultiples(number, position);
        scanner.close();
    }
}
