// Create a function that takes two strings and returns true if the first string ends with the second string, otherwise false.
// For example:
// checkEnding("abc","bc") -> true

package All_Coding_Exercises.Easy;

import org.jetbrains.annotations.Contract;

public class q002 {
    static boolean checkEnding(String firstString, String secondString) {
        boolean b;
        if (firstString.endsWith(secondString)) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(checkEnding("Hello", "lo"));
    }
}
