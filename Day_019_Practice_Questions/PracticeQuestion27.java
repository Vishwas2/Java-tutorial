package Day_019_Practice_Questions;
// WAP to print the following pattern (this time using while loop) :

// ****
// ***
// **
// *

public class PracticeQuestion27 {
    public static void main(String[] args) {
        int i = 4;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
