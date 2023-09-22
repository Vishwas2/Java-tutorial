// This is a program to generate one lakh random numbers and then sort these numbers in ascending and descending order using bubble sort.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Arrays;
import java.util.Random;

public class q014_SortingOneLakhNumbersUsingBubbleSort {
    // Creating a function to generate random numbers:
    public static int[] generateRandomNumbers(int amount) {
        // amount is the number of random numbers that you want to generate
        // we will store the random numbers generated in an array
        int[] randomNumberArray = new int[amount];
        Random random = new Random();
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = random.nextInt(-100000, 100001); // setting the range for random numbers
        }
        return randomNumberArray;
    }

    // Creating a function to sort an array in ascending order using bubble sort:
    public static void ascendingBubbleSort(int[] arr) {
        // Note that bubble sort is not the best sorting algorithms and there are much better alternatives
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swapping the two elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
        // printing out the sorted array :
        System.out.println("The array in ascending order is : ");
        System.out.println(Arrays.toString(arr));
    }

    // Creating a function to sort an array in descending order using bubble sort
    public static void descendingBubbleSort(int[] arr) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    // swapping the two elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
        // printing out the sorted array :
        System.out.println("The array in descending order is : ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to generate one lakh random numbers and sort them in ascending and descending order using bubble sort");
        int[] arr = generateRandomNumbers(100000);
        descendingBubbleSort(arr);
        ascendingBubbleSort(arr);
    }
}
