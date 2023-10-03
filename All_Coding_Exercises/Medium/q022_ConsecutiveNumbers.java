// Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers
// where each number appears exactly once.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q022_ConsecutiveNumbers {
    // Creating the function to check whether elements in the array can be re-arranged to form a consecutive list of numbers :
    static void consecutiveNumbersCheck(int[] arrayOfIntegers) {
        // approach used : first I will sort all the elements in the array in ascending array and then check if they are consecutive numbers
        // Using bubble sort to sort all the elements in ascending order :
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arrayOfIntegers.length - 1; i++) {
                if (arrayOfIntegers[i] > arrayOfIntegers[i + 1]) {
                    // swapping the elements :
                    int temp = arrayOfIntegers[i];
                    arrayOfIntegers[i] = arrayOfIntegers[i + 1];
                    arrayOfIntegers[i + 1] = temp;
                    b = true;
                }
            }
        }
        // now the array will be sorted in ascending order, so we will check if the elements are consecutive numbers
        int count = 0;
        for (int i = 0; i < arrayOfIntegers.length - 1; i++) {
            if (arrayOfIntegers[i] == arrayOfIntegers[i + 1] - 1) {
                count++;
            }
        }
        if (count == arrayOfIntegers.length - 1) {
            System.out.println("The elements in the array can be rearranged to form consecutive list of numbers.");
        } else {
            System.out.println("The array cannot be re-arranged into an array on consecutive numbers.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of the array : ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        consecutiveNumbersCheck(arr);
        scanner.close();
    }
}