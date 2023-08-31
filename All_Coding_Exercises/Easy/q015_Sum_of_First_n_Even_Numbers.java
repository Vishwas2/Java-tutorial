// Create a method to print out the sum of first n even numbers.

package easy;

import java.util.Scanner;

public class q015_Sum_of_First_n_Even_Numbers {
    static void evenSum(int number) {
        int temp = number;
        int num = 0;
        int sum = 0;
        while (number > 0) {
            num = num + 2;
            sum = sum + num;
            number--;
        }
        System.out.println("The sum of the first " + temp + " even numbers is : " + sum);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the sum of first n even numbers.");
        System.out.println("Enter the number of even numbers you want to add : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        evenSum(input);
        scanner.close();
    }
}
