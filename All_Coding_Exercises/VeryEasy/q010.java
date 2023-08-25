// Create a function that finds out the maximum range of a triangle's third edge, where the side lengths are all integers
// (side1 + side2 -1) = maximum range of the third edge.

package All_Coding_Exercises.VeryEasy;

public class q010 {
    static void maximumRangeOfThirdEdge(int side1, int side2) {
        System.out.println("The maximum range of the third edge is : " + (side1 + side2 - 1));
    }

    public static void main(String[] args) {
        maximumRangeOfThirdEdge(12,15);
    }
}
