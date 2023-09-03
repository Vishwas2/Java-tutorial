package VeryEasy;

import java.nio.file.ClosedFileSystemException;
import java.util.ArrayList;
import java.util.Scanner;

public class q014_Factors_of_a_Number {
    public static ArrayList<Integer> factors(int number) {
        int i = 1;
        ArrayList<Integer> listOfFactors = new ArrayList<>();
        while (i < ((number / 2) + 1)) {
            if (number % i == 0) {
                listOfFactors.add(i);
            }
            i++;
        }
        listOfFactors.add(number);
        return listOfFactors;
    }

    public static void main(String[] args) {
        System.out.println("This is a program that takes in a number and prints out all of the factors of that number.");
        System.out.println("Enter the number whose factors you want to check :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The factors of the number are : " + factors(input));
        scanner.close();
    }
}
