package VeryEasy;

import java.util.Scanner;

public class q025_Maximum_Number {
    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The maximum number is : " + max);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the maximum number entered by the user .");
        System.out.println("How many numbers do you want to enter : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        max(arr);
        scanner.close();
    }
}
