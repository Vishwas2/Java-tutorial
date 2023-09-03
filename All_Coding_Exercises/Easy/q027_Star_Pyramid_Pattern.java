// Create a function to print out the following pattern :
// *
// **
// ***
package Easy;

public class q027_Star_Pyramid_Pattern {
    static void straightStarPattern(int number) {
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        straightStarPattern(5);
    }
}
