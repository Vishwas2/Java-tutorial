package Exercises.All_Coding_Exercises.Easy;

import java.util.Scanner;

public class q039_ReplacingVowels {
    // creating a method which can take in a string and replace all the vowels with *
    static void replaceVowels(String s){
        String result = s.replaceAll("[aeiouAEIOU]","*");
        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.println("This is a program which takes a string as input and replaces all the vowels in it with *.");
        System.out.println("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("The new string is : ");
        replaceVowels(string);
        scanner.close();
    }
}
