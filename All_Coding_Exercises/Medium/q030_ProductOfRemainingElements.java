// Write a function that returns true if you can partition an array into one element and the rest, such that this element
// is equal to the product of all other elements excluding itself.
// For example : canPartition([2, 8, 4, 1]) ➞ true

package Exercises.All_Coding_Exercises.Medium;

import javax.swing.*;
import java.util.Scanner;

public class q030_ProductOfRemainingElements {
    // Creating a function to check if one element is equal to the product of all other elements excluding itself.
    static boolean canPartition(int[] arr) {
        // approach used : I will select one element at a time and check the multiple of the other elements and compare them
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int product = 1;

            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            if (temp == product) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the integer array : ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        // Creating an array of the given length :
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        System.out.println(canPartition(arr));
    }
}
