package VeryEasy;

import java.util.Scanner;

public class q013_Subtract_The_Product_and_Sum_Of_an_Integer {
    public static int differenceBetweenProductAndSum(int integer) {
        int clone = integer;
        int sum = 0;
        int product = 1;
        while (integer > 0) {
            int number = integer % 10;
            sum = sum + number;
            integer /= 10;
        }
        while (clone > 0) {
            int num = clone % 10;
            product = product * num;
            clone /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println("This is a program in Java that takes an integer as input and prints out the difference between the product and " +
                "sum of the digits of an integer");
        System.out.println("Enter an integer :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("The difference between the product and the sum of the digits of the integer is : " + differenceBetweenProductAndSum(input));
        scanner.close();
    }
}
