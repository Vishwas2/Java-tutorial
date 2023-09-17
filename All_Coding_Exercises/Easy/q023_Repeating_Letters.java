// Create a method that takes a string and returns a string in which each character is repeated once.
// For example : doubleChar("String") ➞ "SSttrriinngg"

package Exercises.All_Coding_Exercises.Easy;

public class q023_Repeating_Letters {
    static void stringRepeat(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            result.append(c).append(c);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        stringRepeat("Hello"); // HHeelllloo
    }
}
