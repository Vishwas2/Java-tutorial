package Day_073_Practice_Questions;

// Write a program that allows you to keep accessing an element of the array until a valid index is given. If max retries exceed 5 print "Error".

import java.util.Scanner;

public class PracticeQuestion073 {
    public static void main(String[] args) {
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
        }
        if (temp == 5) {
            System.out.println("Error.");
        }
    }
}
