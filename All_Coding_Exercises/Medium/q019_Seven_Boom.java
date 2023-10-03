// Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
// Otherwise, return "there is no 7 in the array".

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q019_Seven_Boom {
    public static void main(String[] args) {
        System.out.println("This is a program which takes an array of integers as input and prints out BOOM! if the number 7 appears " +
                "otherwise it will print there is no 7 in the array.");
        System.out.println("Enter the length of the array you want to enter : ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        // Creating an array of the given size :
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Traversing through the array...");
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == 7) {
                System.out.println("BOOM!");
                break;
            } else if (i == (arrayLength - 1) && arr[arrayLength - 1] != 7) {
                System.out.println("There is no 7 in the array.");
            }
        }
        scanner.close();
    }
}
