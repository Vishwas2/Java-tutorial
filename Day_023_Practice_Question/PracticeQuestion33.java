package Day_023_Practice_Question;
// Write a Java program to reverse an array

import java.util.Scanner;

public class PracticeQuestion33 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int j = 4;
        /*
         * Taking the elements of the array as input and also making a different array
         * and storing elements in it in reverse order
         */
        int[] arrReverse = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element " + (i + 1) + " of the array :");
            arr[i] = sc.nextInt();
            while (j >= 0) {
                // this can also be done with for loop but it has to be outside the for loop
                arrReverse[j] = arr[i];
                j = j - 1;
                break;
            }
        }
        // Printing the reversed array :
        System.out.println("The elements of the array have been reversed.");
        System.out.println("The elements of the reversed array are :");
        for (int i = 0; i < 5; i++) {
            System.out.println(arrReverse[i]);
        }
        sc.close();
    }
}
