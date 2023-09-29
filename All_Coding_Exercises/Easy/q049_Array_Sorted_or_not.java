// WAP to check if the array is sorted or not if the array is not sorted, sort it using bubble sort

package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q049_Array_Sorted_or_not {
    // creating a function to perform ascending bubble sort
    static void ascendingBubbleSort(int[] arr) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swapping the two numbers
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
    }

    // creating a function to perform descending bubble sort
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
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check if the array is sorted or not and sort it if it isn't sorted.");
        System.out.println("Enter the size of the array you want to enter : ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter element " + (i + 1) + (" :"));
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array is : ");
        for (int element : arr) {
            System.out.println(element);
        }
        // checking if the array is sorted or not :
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                count++;
            } else if (arr[i] <= arr[i + 1]) {
                count--;
            }
        }
        String response;
        if (count == arr.length - 1) {
            System.out.println("The array is sorted in descending order.");
        } else if (count == -(arr.length - 1)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted .");
            System.out.println("Do you want to sort the array ? (press a to sort in ascending order), (press d to sort in descending order), (press n to preform no sorting.");
            response = scanner.next();
            if (response.equalsIgnoreCase("a")) {
                ascendingBubbleSort(arr);
                System.out.println("Array after performing ascending bubble sort : ");
                for (int element : arr) {
                    System.out.println(element);
                }
            } else if (response.equalsIgnoreCase("d")) {
                descendingBubbleSort(arr);
                System.out.println("Array after performing descending bubble sort : ");
                for (int element : arr) {
                    System.out.println(element);
                }
            }
        }
    }
}
