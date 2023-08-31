// Create functions to sort an array in ascending and descending order.

package easy;

import java.util.Arrays;

public class q011_Sorting_an_Array {
    // we will be using bubble sort to sort the array in ascending and descending order.
    static void descendingSort(int[] array) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    b = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void ascendingSort(int[] array) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    b = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = {12, 32, 23, 123, -90, 13, 8, 34}; // making an array
        ascendingSort(arr); // [-90, 8, 12, 13, 23, 32, 34, 123]
        descendingSort(arr);// [123, 34, 32, 23, 13, 12, 8, -90]
    }
}