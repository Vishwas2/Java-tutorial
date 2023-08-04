// Create a class Game, which allows the user to "Guess the number ". The computer will generate a random number between
// 1 and 100 (both inclusive), this number will not be printed. The computer will tell you whether the number that you
// have entered is smaller or bigger than the actual number. A score will be printed out on the basis of how many tries
// you took to guess the number (A+ for 5 or less, A for 10 or less, B for 15 or less, C for 20 or less, otherwise D).
// Once the user guesses the correct number the score will be displayed, and he will be asked whether he wants to play
// another round or not , if yes run the program again , if no print "Goodbye!".
/* GAME SHOULD HAVE THE FOLLOWING METHODS :
 * 1. Constructor to generate a random number.
 * 2. takeUserInput() -> to take a number as input from the user
 * 3. isCorrectNumber() -> to detect whether the number entered is correct or not
 * 4. getter and setter for noOfGuesses
 * use properties such as noOfGuesses(int), etc. to get this task done
 * */

package Exercises;

import java.util.Random; // Used to generate a random number in Java
import java.util.Scanner; // Used to take user input in Java

public class GuessTheNumberGame {
    static class Game {
        int originalNumber;
        int count = 0; // The number of tries the user took

        public Game() {
            Random random = new Random();
            originalNumber = random.nextInt(100) + 1; // +1 because the output would be 0 to 99
            // System.out.println("The original number is : " + originalNumber);
        }

        public void getUserInput() { // making a recursive method
            System.out.println("Enter the number which you think is the correct number : ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            count++;
            if (input == originalNumber) {
                System.out.println(input + " is the correct number. Congratulations !!!");
                printScore();

            } else {
                if (originalNumber > input) {
                    System.out.println("The number you entered is smaller than the original number.");
                } else {
                    System.out.println("The number you entered is bigger than the original number.");
                }
                getUserInput(); // keeps on running until the input is equal to the original number
            }
        }

        // Making a method printScore to display the score of the player.
        public void printScore() {
            System.out.println("You took " + count + " tries.");
            if (count <= 5) {
                System.out.println("Your score is : A+");
            } else if (count <= 10) {
                System.out.println("Your score is : A");
            } else if (count <= 15) {
                System.out.println("Your score is : B");
            } else if (count <= 20) {
                System.out.println("Your score is : C");
            } else {
                System.out.println("Your score is : D");
            }
        }

        public int getOriginalNumber() {
            return originalNumber;
        }
    }

    public static void main(String[] args) {
        String answer = "y";
        while (answer.equals("y")) { // While loop which keeps on running until the player presses n
            Game game = new Game();
            game.getUserInput();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play the game again ? (press y for yes and n for no) :");
            answer = scanner.next();
        }
        System.out.println("Goodbye !!!"); // Printing goodbye message when the program comes out of the while loop
    }
}
