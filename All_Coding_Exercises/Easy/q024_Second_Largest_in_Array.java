package Easy;

import java.util.Arrays;

public class q024_Second_Largest_in_Array {
    // Creating a function to sort an array of integers in ascending order using bubble sort :
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
        System.out.println("This is a program to print out the second largest element in an array of integers");
        int[] array = {1, 22, 32, 14, 4, 56};
        descendingBubbleSort(array);
        System.out.println("The second largest element of the array is : " + array[1]);
    }
}
