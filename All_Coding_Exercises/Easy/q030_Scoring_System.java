// Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system. A
// player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital letters,
// return an array of the players' scores.
// For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points, and Charlotte
// scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C. So the array [3, 2, 5] should be returned.
// calculateScores("ABCBACC") ➞ [2, 2, 3]
package Easy;

import java.util.Arrays;

public class q030_Scoring_System {
    static int[] calculateScores(String input) {
        int[] arr = {0, 0, 0};
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                arr[0]++;
            } else if (input.charAt(i) == 'B') {
                arr[1]++;
            } else if (input.charAt(i) == 'C') {
                arr[2]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateScores("ABBACCCCAC")));
        // The output of the above code is :
        // [3,2,5]
    }
}
