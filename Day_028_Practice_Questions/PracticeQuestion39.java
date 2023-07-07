package Day_028_Practice_Questions;
// Write a recursive function to calculate the sum of first n natural numbers.

public class PracticeQuestion39 {
    // Calculating sum using iterative approach
    static int sumIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }

    // Calculating sum using the recursive approach
    static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The sum of first 100 natural numbers using recursion is : " + sumRecursive(100));
        System.out.println("The sum of first 100 natural numbers using iterative approach is : " + sumIterative(100));
    }
}