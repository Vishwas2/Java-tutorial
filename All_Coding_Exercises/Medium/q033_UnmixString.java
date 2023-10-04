// lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say: Please help me unmix these strings!
//Somehow my strings have all become mixed up; every pair of characters has been swapped. Help me undo this, so I can
// understand my strings again.

package Exercises.All_Coding_Exercises.Medium;

public class q033_UnmixString {
    // Creating a function that will swap pair of characters
    static void unmixString(String input) {
        // storing string as an array of char
        char[] arr = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
        }
        for (int i = 0; i < input.length() - 2; i = i + 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        StringBuilder unmixedString = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            unmixedString.append(arr[i]);
        }
        System.out.println("The unmixed string is : " + unmixedString);
    }

    public static void main(String[] args) {
        unmixString("lPaeesh le pemu mnxit ehess rtnisg!");
    }
}
