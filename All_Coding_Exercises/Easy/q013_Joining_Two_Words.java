// A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the
// first character to an uppercase letter.

package easy;

public class q013_Joining_Two_Words {
    static void joinWord(String firstPart, String secondPart) {
        String complete = firstPart.concat(secondPart);
        System.out.println(complete);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to reverse a string.");
        joinWord("comp", "lete");
        // The output of the above statement is : complete
    }
}
