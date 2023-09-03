// Print out the following pattern :
// *****
// *****
// *****
// *****

package Easy;

import java.util.Scanner;

public class q025_printing_Rectangular_Star_Pattern {
    static void rectangularStarPattern(int length, int breadth) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the rectangular star pattern.");
        System.out.println("Enter the length of the rectangular star pattern : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangular star pattern :");
        int breadth = scanner.nextInt();
        rectangularStarPattern(length, breadth);
        scanner.close();
    }
}
