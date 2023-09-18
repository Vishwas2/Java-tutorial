// Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. Return the longest side and
// medium-length side in that order.
// For example : otherSides(1) ➞ [2.0, 1.73]

// NOTE:
// 30° by 60° by 90° triangles always follow this rule: let's say the shortest side length is x units, the hypotenuse would
// be 2x units and the other side would be x * square root of 3.

package Exercises.All_Coding_Exercises.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class q009_FindTheOtherTwoSideLength {
    public static void otherSides(int shortestSide) {
        float largestSide = 2f * shortestSide;
        float mediumSide = 1.73f * shortestSide;
        float[] arr = {largestSide, mediumSide};
        System.out.println("The length of the other two sides are : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the longest and medium side length of a 30° by 60° by 90° triangle" +
                " given the length of the shortest side.");
        System.out.println("Enter the length of the shortest side of the triangle : ");
        Scanner scanner = new Scanner(System.in);
        int shortestSide = scanner.nextInt();
        otherSides(shortestSide);
        scanner.close();
    }
}
