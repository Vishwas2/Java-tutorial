package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q006_Finding_Element_in_2DArray {
    public static void main(String[] args) {
        System.out.println("This is a program to take a 2D array as input from the user and the ask the user for a specific element and print out its position.");
        // taking the number of rows as input :
        System.out.println("Enter the number of rows of the 2D array : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        // taking the number of columns as input :
        System.out.println("Enter the number of columns of the 2D array : ");
        int columns = scanner.nextInt();
        // creating the 2D array :
        int[][] arr = new int[rows][columns];
        // taking array elements as input from the user :
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element [" + i + "][" + j + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // printing the entered array :
        System.out.println("The elements of the array are : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the element in the array whose position you want to print out : ");
        int element = scanner.nextInt();
        // searching for the element in the array :
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == element) {
                    System.out.println("The position of the element is : [" + i + "][" + j + "]");
                    break;
                } else if (i == rows - 1 && j == columns - 1 && arr[i][j] != element) {
                    System.out.println("The element is not present in this array.");
                }
            }
        }
        scanner.close();
    }
}
