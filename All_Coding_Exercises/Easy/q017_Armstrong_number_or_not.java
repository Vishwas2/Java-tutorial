// Create a method in java to check if the number entered is an Armstrong number or not.

package Easy;

import java.util.Scanner;

public class q017_Armstrong_number_or_not {
    static void armstrongOrNot(int number) {
        int clone = number;
        int clone1 = clone;
        int count = 0;
        while (clone > 0) {
            clone /= 10;
            count++;
        }
        int sum = 0;
        while (clone1 > 0) {
            int num = clone1 % 10;
            sum = (int) (sum + Math.pow(num, count));
            clone1 /= 10;
        }
        if (number == sum) {
            System.out.println("The number is an Armstrong number .");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether the number entered by the user is an armstrong number or not.");
        System.out.println("Enter the number you want to check : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        armstrongOrNot(input);
    }
}
