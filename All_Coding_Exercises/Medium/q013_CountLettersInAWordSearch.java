// Create a function that counts the number of times a particular letter shows up in the word search.
// You will always be given an array with 5 sub-arrays

// For example :
// letterCounter([
//  ['D', 'E', 'Y', 'H', 'A', 'D'],
//  ['C', 'B', 'Z', 'Y', 'J', 'K'],
//  ['D', 'B', 'C', 'A', 'M', 'N'],
//  ['F', 'G', 'G', 'R', 'S', 'R'],
//  ['V', 'X', 'H', 'A', 'S', 'S']
//], 'D') ➞ 3

package Exercises.All_Coding_Exercises.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class q013_CountLettersInAWordSearch {
    // Creating a function to search and count the particular letter :
    public static void countLettersInArrays(char[][] arrayOfFiveSubarrays, char letterToSearch) {
        // Now we need to traverse through all the elements of the 5 arrays and search the letter irrespective of the case
        int count = 0;
        char letterToSearch1 = Character.toLowerCase(letterToSearch);
        char letterToSearch2 = Character.toUpperCase(letterToSearch);
        for (char[] c : arrayOfFiveSubarrays) {
            for (char c1 : c) {
                if (letterToSearch1 == c1) {
                    count++;
                }
                if (letterToSearch2 == c1) {
                    count++;
                }
            }
        }
        System.out.println("The letter occurs " + count + " times.");
    }

    public static void main(String[] args) {
        System.out.println("This is a program which takes in an array of 5 sub arrays and the letter you want to search " +
                " (irrespective of the case) as input and prints out the number of times it occurs in the array.");
        // Creating a sample array, you can also take all the array elements as input from the user if you want
        char[][] array = {{'a', 'b', 'c', 'd', 'e'}, {'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'}, {'f', 'g', 'h', 'i', 'j'}, {'k', 'l', 'm', 'n', 'o'}};
        System.out.println("The array entered is :");
        // printing out the array using enhanced for loop :
        for (char[] strings : array) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println("Now enter the letter that you want to search : ");
        Scanner scanner = new Scanner(System.in);
        char letterToSearch = scanner.next().charAt(0);
        countLettersInArrays(array, letterToSearch);
        scanner.close();
    }
}
