package VeryEasy;

import java.util.Arrays;

public class q023_Descending_Bubble_Sort {
    public static void descendingBubbleSort(int[] arr) {
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
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to sort an array of integers in descending order using bubble sort");
        int[] arr = {12, 23, 21, 45, 34, 45, -78, 123, 4};
        descendingBubbleSort(arr);
        // The output of the above code is :
        // [123, 45, 45, 34, 23, 21, 12, 4, -78]
    }
}
