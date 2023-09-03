// Write a function that finds the word "bomb" in the given string (not case sensitive). Return "DUCK!" if found,
// otherwise,"Relax, there's no bomb.".
// NOTE : The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed).

package Easy;

public class q022_Finding_The_Bomb {
    static void bomb(String input) {
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == 'b' || input.charAt(i) == 'B') && (input.charAt(i + 1) == 'o' || input.charAt(i + 1) == 'O')
                    && (input.charAt(i + 2) == 'm' || input.charAt(i + 2) == 'M') && (input.charAt(i + 3) == 'b' || input.charAt(i + 3) == 'B')) {
                System.out.println("DUCK!");
                break;
            } else if (i == input.length() - 1) {
                System.out.println("Relax, there's no bomb.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program that can detect the word bomb in a string.");
        bomb("On 6 and 9 August 1945, the United States detonated two atomic bombs over the Japanese cities of Hiroshima and Nagasaki respectively.");
        // The output of the above program is :
        // DUCK!
    }
}
