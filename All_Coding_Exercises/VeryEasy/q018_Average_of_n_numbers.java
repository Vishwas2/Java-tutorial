package VeryEasy;

import java.util.Scanner;

public class q018_Average_of_n_numbers {
    public static void average(int[] arr) {
        int sum = 0;
        int length = arr.length;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("The average of the numbers entered is : " + (sum / length));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the average of all of the numbers entered");
        System.out.println("Enter the amount of numbers whose average you want to calculate : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        average(arr);
        scanner.close();
    }
}
