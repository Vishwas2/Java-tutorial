package Day_018_Break_and_Continue;
// Break and continue in Java

/*The break statement is used to exit the loop irrespective of whether the 
 * condition is true or false. Whenever a break is encountered inside the loop 
 * the control is sent outside the loop.
 */

/*The continue statement is used to immediately move to the next iteration of the 
 * loop. The control is taken to the next iteration thus skipping everything below 
 * continue inside the loop for that iteration.
 */

public class Day018 {
    public static void main(String[] args) {
        // EXAMPLE OF BREAK :
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(i);
        }

        // EXAMPLE OF CONTINUE :
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the even numbers
            }
            System.out.println(i);
        }

    }
}
