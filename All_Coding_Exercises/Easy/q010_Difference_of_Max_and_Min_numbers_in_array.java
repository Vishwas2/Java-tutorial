// Create a function that takes an array of integers as input and prints out the difference between the maximum and the
// minimum number in the array.

package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

class q10_Difference_of_Max_and_Min_numbers_in_array {
    static void differenceBetweenMaxMin(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The maximum element in the array is " + max + " and the minimum element in the array is " + min);
        System.out.println("The difference between the maximum and the minimum element in the array is : " + (max - min));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the difference between the maximum and smallest element of an array.");
        System.out.println("How many numbers do you want to add in the array ?");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 1; i <= arrayLength; i++) {
            System.out.println("Enter element " + i + " of the array : ");
            arr[i - 1] = scanner.nextInt();
        }
        differenceBetweenMaxMin(arr);
        scanner.close();
    }
}
