package Day_023_Practice_Question;
// Write a Java program to find the minimum element in an array.

import java.util.Scanner;

public class PracticeQuestion35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array :");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int location = 1;
        for (int i = 1; i < 5; i++) {
            if (min > arr[i]) {
                min = arr[i];
                location = i + 1;
            }
        }
        System.out.println();
        System.out.println("The minimum element in the array is " + min + " and its location is " + location);
        sc.close();
    }
}
