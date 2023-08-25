// You are give the following sequence : 1, 3, 6, 10, 15
// You have to write a function that prints out the number at a given position in this sequence.
// For example : sequence(6) -> 21

package All_Coding_Exercises.Easy;

public class q003 {
    // You might have cracked the pattern in the given sequence, first 2 is added to the first number, then 3 to the next and so on.
    static void sequence(int position) {
        int number = 1;
        for (int i = 1; i < position; i++) {
            number = number + i + 1;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        sequence(7);
        // The output is 28
    }
}
