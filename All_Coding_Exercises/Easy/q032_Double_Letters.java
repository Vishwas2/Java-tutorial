// Create a function that takes a word and returns true if the word has two consecutive identical letters.

package Easy;

public class q032_Double_Letters {
    static boolean doubleLetter(String string) {
        boolean b = false;
        string = string.toLowerCase(); // converting string to lowercase so that we can ignore the case of the characters of the string
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                b = true;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(doubleLetter("Vishwas"));
    }
}
