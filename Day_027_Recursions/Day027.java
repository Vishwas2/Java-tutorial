package Day_027_Recursions;
// A FUNCTION WHICH CALLS ITSELF IS CALLED A RECURSIVE FUNCTION.

// SUCH CALLING OF FUNCTION BY ITSELF IS CALLED RECURSION.
// For Example : Factorial of a number

public class Day027 {
    static int factorial_Recursive(int n) {
        // factorial(n) = n * (n-1) * ... * 1
        // the factorial of 0 is 1
        // for example the factorial of 3 = 3*2*1 = 6
        // factorial (n) = factorial (n-1)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial_Recursive(n - 1);
        }
    }

    static int factorial_Iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("The value of the factorial of 4 is : " + factorial_Recursive(4));
        System.out.println("The value of the factorial of 4 is : " + factorial_Iterative(4));
        // The output in both the cases will be the same (24).
    }
    // Some problems are better solved using the iterative approach whereas other
    // problems are better solved using the recursive approach. A problem that can
    // be solved iteratively can also be solved recursively. It is our decision how
    // we want to solve the problem
}
