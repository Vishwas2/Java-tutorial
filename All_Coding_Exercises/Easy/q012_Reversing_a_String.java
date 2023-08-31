// Create a method that takes a string as its argument and returns the string in reversed order.
// reverse("Hello World") ➞ "dlroW olleH"

package easy;

public class q012_Reversing_a_String {
    static void reverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        reverse("Hello World");
    }
}
