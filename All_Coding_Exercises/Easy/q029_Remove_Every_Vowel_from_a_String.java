// Create a function which takes a string as input and removes all the vowels from it.

package Easy;

public class q029_Remove_Every_Vowel_from_a_String {
    static void removeVowel(String input) {
        String result = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeVowel("I have never seen a thin person drinking Diet Coke.");
        // The output of the above code is :
        // hv nvr sn  thn prsn drnkng Dt Ck.
    }
}
