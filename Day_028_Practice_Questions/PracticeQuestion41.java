package Day_028_Practice_Questions;
// Write a function to print the nth term of the fibonacci series using both recursive and iterative approach

public class PracticeQuestion41 {
    // static int fibonacci_Recursive(int n){
    // if(n==)
    // }
    static int fibonacci_Iteratived(int n) {
        n--;
        if (n <= 1) {
            return n;
        }
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    static int fibonacci_Recursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci_Recursive(n - 1) + fibonacci_Recursive(n - 2);
    }

    public static void main(String[] args) {
        int result = fibonacci_Iteratived(5);
        System.out.println("The 5th number in the fibonacci series is : " + result);
        int n = 5;
        int answer = fibonacci_Recursive(n - 1);
        System.out.println("The 5th number of the fibonacci series is : " + answer);
    }
}
