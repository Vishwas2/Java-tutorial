// Create a function in java to print out the following pattern :
// 1
// 12
// 123
// 1234

package Easy;

public class q034_Pyramid_Number_Pattern {
    static void numberPattern(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPattern(5);
    }
}
