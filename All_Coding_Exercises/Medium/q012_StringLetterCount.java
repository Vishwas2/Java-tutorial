package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q012_StringLetterCount {
    public static void stringLetterCount(String string, char letterToCount) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letterToCount) {
                count++;
            }
        }
        System.out.println("The number of occurrences of the letter in the string is : " + count);
    }

    public static void main(String[] args) {
        System.out.println("This is a program which takes a string and letter as input and prints out the number of times" +
                " that letter comes in the string.");
        System.out.println("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Enter the letter you want to search in the string : ");
        char letterToSearch = scanner.next().charAt(0);
        stringLetterCount(s, letterToSearch);
        scanner.close();
    }
}
