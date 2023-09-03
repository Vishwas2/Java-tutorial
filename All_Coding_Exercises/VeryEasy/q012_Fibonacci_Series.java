// Fibonacci series : 0,1,1,2,3,5,8,13,...

package VeryEasy;

import java.util.Scanner;

public class q012_Fibonacci_Series {
    public static int fibonacci(int position) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        if (position == 1) {
            return n1;
        } else if (position == 2) {
            return n2;
        } else if (position < 1) {
            System.out.println("Enter a valid position.");
        } else {
            while (position > 2) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                position--;
            }
            return n3;
        }
        return n1;
    }

    public static void main(String[] args) {
        System.out.println("This is a program in Java that takes a number as input and prints out the number at that position in the Fibonacci series.");
        System.out.println("Enter the position of the number you want to print out :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fibonacci(input));
        scanner.close();
    }
}
