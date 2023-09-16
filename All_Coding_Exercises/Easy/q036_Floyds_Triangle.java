// Create a function to print out the following pattern (also known as Floyd's triangle):
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

package Easy;

import java.util.Scanner;

public class q036_Floyds_Triangle {
    static void floydTriangle(int number) {
        int num = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the Floyd's triangle using a method.");
        System.out.println("Enter the number of rows you want in the triangle : ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        floydTriangle(rows);
        scanner.close();
    }
}
