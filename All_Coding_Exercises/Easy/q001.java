// Create a method that takes a string and returns the word count. The string will be a sentence.
// For example : wordCount("This is a test") -> 4

package All_Coding_Exercises.Easy;

public class q001 {
    static void wordCount1(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("The number of words in the sentence are : " + count);
    }

    public static void main(String[] args) {
        wordCount1("What is your name?");
    }
}
