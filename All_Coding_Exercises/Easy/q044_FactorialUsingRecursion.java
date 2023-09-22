package Exercises.All_Coding_Exercises.Easy;

public class q044_FactorialUsingRecursion {
    // Creating a recursive function to print out the factorial of a number
    static int recursiveFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1; // base case
        }
        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the factorial of a number using recursion.");
        System.out.println("The factorial of 5 is : " + recursiveFactorial(5));
    }
}
