package VeryEasy;

import java.util.Random;

public class q035_Random_Array_element {
    public static void main(String[] args) {
        System.out.println("This is a program to print out a random element from an array.");
        // we will take an integer array for this example, but you can take any type of array.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        int randomIndex = random.nextInt(0, arr.length);
        System.out.println("A random element from the array arr is : " + arr[randomIndex]);
    }
}
