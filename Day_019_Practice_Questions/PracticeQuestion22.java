package Day_019_Practice_Questions;
// WAP to print the following pattern :

// ****
// ***
// **
// *

public class PracticeQuestion22 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}