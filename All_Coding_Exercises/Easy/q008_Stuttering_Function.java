// Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice
// with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.
// For example : stutter("incredible") ➞ "in... in... incredible?"

package easy;

public class q008_Stuttering_Function {
    static String stutter(String word){
        String firstTwoLetters = word.substring(0,2);
        return (firstTwoLetters+"... "+firstTwoLetters+"... "+word+"?");
    }

    public static void main(String[] args) {
        System.out.println(stutter("Hello"));
    }
}
