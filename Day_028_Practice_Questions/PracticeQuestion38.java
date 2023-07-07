package Day_028_Practice_Questions;
// WAP to print the following pattern using functions :

// *
// **
// ***

public class PracticeQuestion38 {
    static void starPatternIterative(int a) {
        // a is the number of star lines that we have to print
        for (int i = 1; i <= a; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
                // Here print is used so that there is no space between the stars
            }
            System.out.println(); // Used to move the cursor to the next line
        }
    }

    static void starPatternRecursive(int n) {
        if (n > 0) {
            starPatternRecursive(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Calling the method starPattern :
        starPatternIterative(5);
        starPatternRecursive(5);
    }
}
