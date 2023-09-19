package Exercises.All_Coding_Exercises.Medium;

public class q011_RecursionArraySum {
    public static int recursiveArraySum(int[] arr, int startIndex) {
        if (startIndex >= arr.length) {
            return 0;
        }
        int currentElement = arr[startIndex];
        int sumOfRest = recursiveArraySum(arr, startIndex + 1);
        return currentElement + sumOfRest;
    }

    public static void main(String[] args) {
        System.out.println("This is a program which calculates the sum of all the elements of an array using a recursive function.");
        // making a sample array to pass to the recursive function
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(recursiveArraySum(arr, 0));
    }
}
