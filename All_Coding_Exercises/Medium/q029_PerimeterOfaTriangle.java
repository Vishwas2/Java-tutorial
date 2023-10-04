// Write a function that takes the coordinates of three points and return the perimeter of the triangle. The given points
// are the vertices of a triangle on a two-dimensional plane
// for example : perimeter(arr[0]={15,7}, arr[1]={5,22},arr[2]={11,1} -> 47.8

package Exercises.All_Coding_Exercises.Medium;

import java.text.DecimalFormat;

public class q029_PerimeterOfaTriangle {
    // Creating a function to calculate the perimeter of the triangle :
    static void calculatePerimeter(int[][] arr) {
        double side1 = Math.sqrt(Math.pow((arr[0][0] - arr[1][0]), 2) + Math.pow((arr[0][1] - arr[1][1]), 2));
        double side2 = Math.sqrt(Math.pow((arr[1][0] - arr[2][0]), 2) + Math.pow((arr[1][1] - arr[2][1]), 2));
        double side3 = Math.sqrt(Math.pow((arr[2][0] - arr[0][0]), 2) + Math.pow((arr[2][1] - arr[0][1]), 2));
        double total = side1 + side2 + side3;

        // Format the result with two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedResult = df.format(total);

        System.out.println("The total perimeter of the triangle is: " + formattedResult);
    }

    public static void main(String[] args) {
        // array to store the vertices of the triangle :
        int[][] arr = {{15, 7}, {5, 22}, {11, 1}};
        calculatePerimeter(arr);
    }
}