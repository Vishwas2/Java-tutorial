// Create a function to print out the following pattern :
// ***
// **
// *

package Easy;

public class q028_Reverse_Star_Pyramid_Pattern {
    static void reverseStarPyramid(int input) {
        for (int i = input; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseStarPyramid(5);
    }
}
