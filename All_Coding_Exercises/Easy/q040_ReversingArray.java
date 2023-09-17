package Exercises.All_Coding_Exercises.Easy;

import java.util.ArrayList;

public class q040_ReversingArray {
    public static void main(String[] args) {
        System.out.println("This is a program to reverse an array in Java.");
        // we will use the following array for this code, but you can take input from the user if you want
        int[] arr = {1,2,3,4,5,6,7,8,9,0}; // sample array
        int[] reverseArr = new int[arr.length]; // creating a new array to store the reversed elements
        // reversing the array :
        for (int i = 0;i<arr.length;i++){
            reverseArr[i]=arr[arr.length-i-1];
        }
        System.out.println("The reversed array is : ");
        // using a for each loop to print out the elements of the reverse array
        for (int element: reverseArr ){
            System.out.println(element);
        }
    }
}