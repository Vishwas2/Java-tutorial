// Create a function that recursively counts the integer's number of digits.
// For example : count(318) ➞ 3
// The function should not count zeroes that before the first non-zero number (for example : 012 should give the number of digits as 2)

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q023_IntegerDigitsCount {
    // Creating a recursive function to count the number of digits :
    static int recursiveDigitCount(int integer) {
        int sum = 0;
        if (integer / 10 <= 0) {
            return 1;
        }
        return sum + 1 + recursiveDigitCount(integer / 10);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to count the number of digits entered by the user.");
        System.out.println("Enter the integer : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(recursiveDigitCount(input));
        scanner.close();
    }
}
