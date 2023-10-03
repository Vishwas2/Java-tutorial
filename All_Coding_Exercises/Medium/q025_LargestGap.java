// Given an array of integers, return the largest gap between the sorted elements of the array.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q025_LargestGap {
    public static void main(String[] args) {
        System.out.println("This is a program to print out the gap between the largest and the smallest element of the array.");
        System.out.println("Enter the length of the array you want to enter : ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        // sorting the array in ascending order using bubble sort :
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swapping the elements :
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
        System.out.println("The smallest number is : " + arr[0] + " The largest number is : " + arr[arrayLength - 1]);
        System.out.println("The difference between the smallest and the largest element is : " + (arr[arrayLength - 1] - arr[0]));
        scanner.close();
    }
}
