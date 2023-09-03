// print out the following pattern :
// *****
// *   *
// *   *
// *****

package Easy;

public class q026_Hollow_Rectangular_Star_Pattern {
    static void hollowRectanglePattern(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (j == 1 || i == 1 || i == length || j == breadth) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectanglePattern(4, 5);
    }
}
