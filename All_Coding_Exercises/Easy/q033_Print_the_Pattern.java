// Create a function to print out the following pattern :
//    *
//   **
//  ***
// ****

package Easy;

import java.util.Scanner;

public class q033_Print_the_Pattern {
    static void starPattern(int number) {
        for (int i = 1; i <= number; i++) {
            // printing spaces
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            // printing stars :
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the star pattern : ");
        System.out.println("Enter the number of rows you want in the star pattern : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        starPattern(input);
        scanner.close();
    }
}
