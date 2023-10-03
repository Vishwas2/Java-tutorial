package Exercises.All_Coding_Exercises.Medium;
// Create a function that takes a string and returns a string ordered by the length of the words. From shortest to longest word.
// If there are words with the same amount of letters, order them alphabetically.
// For example :
// sortByLength("Hello my friend") ➞ "my Hello friend"

// Approach used : first I will break all the individual words in the string and store them in an arrayList, then
// I will sort the arrayList in ascending order and finally concatenate all the words to form a single string.

import java.util.ArrayList;
import java.util.Scanner;

public class q020_SortByLength {
    // creating a function to store all the individual words in an arrayList
    static ArrayList<String> stringArrayList(String string, ArrayList<String> arrayList) {
        int position = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                arrayList.add(string.substring(position + 1, i));
                position = i;
            }
        }
        return arrayList;
    }

    // sorting all the elements in the arraylist using bubble sort :
    static ArrayList<String> bubbleSort(ArrayList<String> arrayList) {
        int n = arrayList.size();
        boolean swapped;
        for (int j = 0; j < n - 1; j++) {
            swapped = false;
            for (int i = 0; i < n - j - 1; i++) {
                if (arrayList.get(i).length() > arrayList.get(i + 1).length()) {
                    // swapping the two elements
                    String temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arrayList;
    }

    // Creating a function to sort the words of the same length in alphabetical order
    static ArrayList<String> alphabeticalOrder(ArrayList<String> arrayList) {
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i).length() == arrayList.get(i + 1).length() && arrayList.get(i).charAt(0) > arrayList.get(i + 1).charAt(0)) {
                    // swapping the elements
                    String temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    b = true;
                }
            }
        }
        return arrayList;
    }

    // Creating a function to concatenate all the ordered words
    static void concatenatedString(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program which takes a string as input and sort all the words in ascending order (based on length).");
        System.out.println("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        // Adding space at the end of the string for stringArrayList to perform correctly
        String newString = inputString + " ";
        ArrayList<String> stringArrayList = new ArrayList<>();
        concatenatedString(alphabeticalOrder(bubbleSort(stringArrayList(newString, stringArrayList))));
        scanner.close();
    }
}
