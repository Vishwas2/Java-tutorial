package Day_028_Practice_Questions;
// Write a Java method to print the following pattern : 

// ***
// **
// *

public class PracticeQuestion40 {
    static void reverse_Star_Pattern(int a) {
        for (int i = a; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverse_Star_Pattern(5);
    }
}
