// Create a function that takes in two numbers and returns true if they are same and false if they are different.

package All_Coding_Exercises.VeryEasy;

public class q009 {
    static boolean equalOrNot(int firstNumber, int secondNumber) {
        boolean b;
        if (firstNumber != secondNumber) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(equalOrNot(3, 1));
    }
}
