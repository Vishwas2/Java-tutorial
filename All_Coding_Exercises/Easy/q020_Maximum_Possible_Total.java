// Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.

package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class q020_Maximum_Possible_Total {
    // creating a method to sort an array in descending order using bubble sort
    static void descendingBubbleSort(int[] arr) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
        System.out.println("The array in descending order is : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // The approach that I am having is that first I will sort the array entered by the user into descending order and
        // the take the sum of the first 5 elements of the array.
        int[] arr = new int[10];
        System.out.println("This is program to print out the sum of the maximum 5 elements of the array.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array.");
            arr[i] = scanner.nextInt();
        }
        descendingBubbleSort(arr);
        int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println("The sum of the maximum 5 elements of the array is : " + sum);
        scanner.close();
    }
}
