package Day_023_Practice_Question;
// Write a java program to find out whether a given integer is present in an array or not

import java.util.Scanner;

public class PracticeQuestion30 {
    public static void main(String[] args) {
        // Taking an array as input from the user :
        Scanner sc = new Scanner(System.in);
        System.out.println("This program checks wheter a specific number is present in the array.");
        System.out.println("Enter the length of the array that you want :");
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter integer number " + (i + 1) + " :");
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to check :");// Inputting the number to be checked.
        int check = sc.nextInt();
        System.out.println("The numbers that you have entered are :");
        for (int j = 0; j < num.length; j++) { // Printing all of the entered elements of the array.
            System.out.println(num[j]);
        }
        for (int k = 0; k < num.length; k++) {
            if (num[k] == check) { // Matching the number to be checked with the elements of the array.
                System.out.println("Number " + check + (" is present in the given array."));
                System.out.println("The position of the element is : " + (k + 1));
                break;
            } else {
                if (k == num.length - 1)
                    System.out.println("Number " + check + " isn't present in the given array.");
                else {
                    continue;
                }
            }
        }
        sc.close();
    }
}
