package Exercises.All_Coding_Exercises.Easy;

public class q046_RecursiveSumOfArray {
    // creating a recursive function to print out the sum of all the elements of an array :
    static int recursiveArrayElementsSum(int[] arr, int startingIndex) {
        if (startingIndex == arr.length) {
            return 0;
        } else {
            return arr[startingIndex] + recursiveArrayElementsSum(arr, startingIndex + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the sum of all the elements of an array using recursion.");
        // creating a sample array
        int[] arr = {1, 2, 3, 4, 5};
        int answer = recursiveArrayElementsSum(arr, 0);
        System.out.println(answer);
    }
}
