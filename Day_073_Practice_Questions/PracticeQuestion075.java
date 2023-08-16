package Day_073_Practice_Questions;

// Write the program in PracticeQuestion074 inside a method which throws your custom exception.

import java.util.Scanner;

class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

public class PracticeQuestion075 {

    public static void main(String[] args) {
        try {
            accessArrayElementWithRetries();
        } catch (MaxRetriesExceededException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void accessArrayElementWithRetries() throws MaxRetriesExceededException {
        int[] array = {10, 20, 30, 40, 50}; // making an array
        System.out.println("This program allows you to access elements of the array.");
        System.out.println("This array only has 5 elements.");
        int temp = 0;
        while (temp < 5) {
            try {
                System.out.println("Enter the index of the element that you want to print :");
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                System.out.println(array[input]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a valid index.");
                temp++;
            } catch (Exception e) {
                System.out.println("Please give a valid input.");
                temp++;
            }

            if (temp == 5) {
                throw new MaxRetriesExceededException("Max retries exceeded.");
            }
        }
    }
}
