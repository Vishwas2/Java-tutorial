// Create a function that takes a string and returns the number of vowels in the string.

package Easy;

public class q018_How_Many_Vowels {
    static void vowelCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels in the string are : " + count);
    }

    public static void main(String[] args) {
        vowelCount("hello");
        vowelCount("hard work");
    }
}
