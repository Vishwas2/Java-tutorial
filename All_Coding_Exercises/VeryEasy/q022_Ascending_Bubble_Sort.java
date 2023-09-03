// Create method to sort an array of integers in ascending and descending order using bubble sort.

package VeryEasy;

import java.util.Arrays;

public class q022_Ascending_Bubble_Sort {
    public static void ascendingBubbleSort(int[] arr) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    b = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to sort an array of integers in ascending order using bubble sort.");
        int[] array = {12, 22, 29, 90, -23, 45, 56, 45};
        ascendingBubbleSort(array);
        // The output of the above code is :
        // [-23, 12, 22, 29, 45, 45, 56, 90]
    }
}
