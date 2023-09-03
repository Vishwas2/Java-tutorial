// Create a function to print out the following pattern :
// 12345
// 1234
// 123
// 12
// 1

package Easy;

public class q035_Inverted_Half_Pyramid_With_Numbers {
    static void invertedPyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedPyramid(5);
    }
}
