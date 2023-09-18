// WAP to print out the number of solutions of a quadratic equation
// The formula to check the number of solutions = D = b^2 - 4ac
// if D is positive then there are 2 solutions
// if D is 0 then there is 1 solution
// if D is negative then there is no solution

package Exercises.All_Coding_Exercises.Medium;

import java.util.Scanner;

public class q007_NumberOfSolutionsOfAQuadraticEquation {
    // creating a function which will print out the number of solutions of the quadratic equation
    public static void quadraticEquationSolCount(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println("The quadratic equation has 2 solutions.");
        } else if (d < 0) {
            System.out.println("The quadratic equation has 0 solutions.");
        } else {
            System.out.println("The quadratic equation has 1 solution.");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program which takes a,b and c of a quadratic equation as inputs and prints out the number of solutions it will have.");
        System.out.println("Enter the value of a : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the value of b : ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of c : ");
        int c = scanner.nextInt();
        quadraticEquationSolCount(a, b, c);
        scanner.close();
    }
}
