// Bubble sort , Selection sort and insertion sort are the most basic sorting algorithms. There are much faster alternatives present like quick sort, merge sort, etc.

/*
1. BUBBLE SORT :
• Bubble sort is a simple sorting algorithm that repeatedly steps through the list,
compares adjacent elements, and swaps them if they are in the wrong order.
• It continues this process until no more swaps are needed, which indicates that the list is
sorted.
• Bubble sort has a time complexity of O(nA2) in the worst and average cases, making it
inefficient for large datasets.
• It is relatively easy to understand and implement, which makes it a good educational
example of a sorting algorithm.
 */

/*
2. SELECTION SORT :
• Selection sort works by dividing the input list into two parts: the sorted and unsorted
portions.
• It repeatedly selects the minimum (or maximum, depending on the sorting order)
element from the unsorted portion and places it at the beginning of the sorted portion.
• This process continues until the entire list is sorted.
• Selection sort also has a time complexity of O(nA2) in the worst and average cases, which
is not efficient for large datasets.
• It has the advantage of making fewer swaps compared to bubble sort.
 */

/*
3. INSERTION SORT :
• Insertion sort builds the sorted list one item at a time, iterating through the input list and
inserting each element into its correct position in the sorted portion.
• It is often likened to sorting a hand of playing cards, where you pick up a card and insert
it into the correct position in the already sorted part of your hand.
• Insertion sort has a time complexity of O(nA2) in the worst and average cases, similar to
bubble and selection sort, but it can be more efficient for small datasets or partially
sorted lists.
• It is also an in-place sorting algorithm, meaning it doesn't require additional memory for
sorting.
 */
package Exercises.Day_096_BubbleSort_SelectionSort_InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class Day096 {
    public static void main(String[] args) {
// Bubble sort works by comparing the adjacent elements of a list and swapping them based on ascending or descending order
// Bubble sort stops when it doesn't have to swap any element of the list.
// Now let's code bubble sort
        // generating an array of random numbers to sort
        int[] firstArray = new int[1000]; // I have created a big array to compare the sorting time, you can shrink the size if you want.
        Random random = new Random();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100000);
        }
        System.out.println("The random array is : " + Arrays.toString(firstArray));
        long startTime = System.currentTimeMillis();
        // We will be sorting the array in ascending order using all the sorting algorithms.
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < firstArray.length - 1; i++) {
                if (firstArray[i] > firstArray[i + 1]) {
                    // swapping adjacent elements
                    int temp = firstArray[i];
                    firstArray[i] = firstArray[i + 1];
                    firstArray[i + 1] = temp;
                    b = true;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Array after implementing Bubble Sort : " + Arrays.toString(firstArray));
        System.out.println("Time took : " + (endTime - startTime) + "ms");

// Selection sort works by remembering the index of the first element of the list then it goes through the entire list and finds
// the smallest element, then it swaps the first element with the smallest element. Now we start from the next position(2nd in this case)
// and again find the smallest element (excluding the first because it is in the correct place) and swap it with the second element.
// This continues until we reach the end of the list.
        int[] secondArray = new int[1000];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = random.nextInt(100000);
        }
        System.out.println("The second random array is : " + Arrays.toString(secondArray));
        long startTime1 = System.currentTimeMillis();
        int length = secondArray.length;
        for (int i = 0; i < length - 1; i++) {
            int min = secondArray[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++) {
                if (secondArray[j] < min) {
                    min = secondArray[j];
                    indexOfMin = j;
                }
            }
            // swapping the elements:
            int temp = secondArray[i];
            secondArray[i] = secondArray[indexOfMin];
            secondArray[indexOfMin] = temp;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Array after implementing selection sort : " + Arrays.toString(secondArray));
        System.out.println("Time took : " + (endTime1 - startTime1) + "ms");

// Insertion Sort works by iterating through all the elements of the list and sorting the elements in the correct position as it proceeds.
// Insertion sort is similar to sorting a deck of cards.
        int[] thirdArray = new int[1000];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = random.nextInt(100000);
        }
        System.out.println("The random array is : " + Arrays.toString(thirdArray));
        long startTime2 = System.currentTimeMillis();
        for (int i = 1; i < thirdArray.length; i++) {
            int currentValue = thirdArray[i];
            int j = i - 1;
            while (j >= 0 && thirdArray[j] > currentValue) { // shifting the bigger element to the right using while loop
                thirdArray[j + 1] = thirdArray[j];
                j--;
            }
            thirdArray[j + 1] = currentValue;
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Array after implementing insertion sort : " + Arrays.toString(thirdArray));
        System.out.println("Time took : " + (endTime2 - startTime2) + "ms");

        System.out.println("Selection sort is the fastest among these three, Insertion sort lies in the middle and Bubble " +
                "sort is the slowest.");
    }
}
