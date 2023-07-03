package Day_023_Practice_Question;
// Write a Java program to find whether an array is sorted or not , if the array isn't sorted ask 

// the user whether he want to sort the array or not and sort it if the answer is yes.

import java.util.Scanner;

public class PracticeQuestion36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // Taking an array as input from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array :");
            arr[i] = sc.nextInt();
        }
        int num = 0;
        // Checking whether the array is sorted or not
        for (int i = 0; i < 4; i++) {
            if (arr[i] > arr[i + 1]) { // For descending order
                num = num - 1; // Decrementing value of num by 1
            } else if (arr[i] < arr[i + 1]) { // For ascending order
                num = num + 1; // Incrementing value of num by 1
            } else {
                continue;
            }
        }
        if (num == -4) {
            System.out.println("The array is sorted in Descending order.");
        } else if (num == 4) {
            System.out.println("The array is sorted in Ascending order.");
        } else {
            System.out.println("The array is not sorted.");
            String input;
            // Asking user whether they want to sort the array or not.
            System.out.println("Do you want to sort the array ?");
            System.out.println("Enter n for no a for ascending order and d for descending order :");
            input = sc.next();
            if (input.equals("n")) {
                System.out.println("No sorting performed.");
            } else if (input.equals("a")) {
                // Sorting the array in ascending order :
                for (int i = 0; i < 5; i++) {
                    for (int j = i + 1; j < 5; j++) {
                        if (arr[i] > arr[j]) {
                            int min = arr[i];
                            arr[i] = arr[j];
                            arr[j] = min;
                        }
                    }
                }
                System.out.println("The array in Ascending order is :");
                for (int i = 0; i < 5; i++) {
                    System.out.println(arr[i]);
                }
            } else if (input.equals("d")) {
                // Sorting the array in descending order :
                for (int i = 0; i < 5; i++) {
                    for (int j = i + 1; j < 5; j++) {
                        if (arr[i] < arr[j]) {
                            int min = arr[i];
                            arr[i] = arr[j];
                            arr[j] = min;
                        }
                    }
                }
                System.out.println("The array in Descending order is :");
                for (int i = 0; i < 5; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                System.out.println("Please give a valid input.");
            }
        }
        sc.close();
    }
}
