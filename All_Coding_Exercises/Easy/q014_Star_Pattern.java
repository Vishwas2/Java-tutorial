// Create a method to print out the following star pattern :
// *
// **
// ***
// ****

package easy;

import java.util.Scanner;

public class q014_Star_Pattern {
    static void starPattern(int numberOfRows){
        for (int i =1;i<=numberOfRows;i++){
            for (int j =i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the star pattern.");
        System.out.println("Enter the number of rows you want in the star pattern :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        starPattern(input);
        scanner.close();
    }
}
