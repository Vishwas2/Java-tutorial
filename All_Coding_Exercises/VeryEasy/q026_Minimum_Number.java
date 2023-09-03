package VeryEasy;

import java.util.Scanner;

public class q026_Minimum_Number {
    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum number is : " + min);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the minimum number.");
        System.out.println("How many numbers do you want to enter? :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        min(arr);
        scanner.close();
    }
}
