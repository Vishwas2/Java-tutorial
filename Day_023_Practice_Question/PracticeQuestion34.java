package Day_023_Practice_Question;
// Write a Java program to find the maximum element in an array.

import java.util.Scanner;

public class PracticeQuestion34 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array :");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int location = 1;
        for (int i = 1; i < 5; i++) {
            if (max < arr[i]) {
                max = arr[i];
                location = i + 1;
            }
        }
        System.out.println();
        System.out.println("The maximum element in the array is " + max + " and its location is " + location);
        sc.close();
    }
}
