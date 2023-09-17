package Exercises;// WAP to create a rock paper scissor game in which you play against computer.
// The game should have 5 rounds.
// Also display the scores after each round.
// Take care of invalid inputs also.

import java.util.Random; // used to generate random numbers
import java.util.Scanner; // used to take user input

public class RockPaperScissor1 {
    public static void main(String[] args) {
        System.out.println("This is a Rock Paper Scissor game .");
        System.out.println("This game will be of 5 rounds.");
        System.out.println("Press r for Rock, p for Paper and s for Scissor.");
        Scanner sc = new Scanner(System.in);
        int computerScore = 0;
        int playerScore = 0;
        for (int i = 1; i < 6; i++) { // for loop which runs 5 times.
            System.out.println("Round " + i + " (press r or p or s ) :");
            String choice = sc.next();
            Random random = new Random(); // to generate random numbers from 1 to 3.
            int randomNumber = random.nextInt(3) + 1; // +1 because the output would be 0 to 2.
            if (choice.equals("r")) {
                if (randomNumber == 1) {
                    System.out.println("Computer chose Rock. ITS A TIE.");
                } else if (randomNumber == 2) {
                    System.out.println("Computer chose Paper. YOU LOSE.");
                    ++computerScore; // increasing the scores.
                } else {
                    System.out.println("Computer chose Scissor. YOU WIN.");
                    ++playerScore;
                }
            } else if (choice.equals("p")) {
                if (randomNumber == 1) {
                    System.out.println("Computer chose Rock. YOU WIN.");
                    ++playerScore;
                } else if (randomNumber == 2) {
                    System.out.println("Computer chose Paper. ITS A TIE.");
                } else {
                    System.out.println("Computer chose Scissor. YOU LOSE");
                    ++computerScore;
                }
            } else if (choice.equals("s")) {
                if (randomNumber == 1) {
                    System.out.println("Computer chose Rock. YOU LOSE.");
                    ++computerScore;
                } else if (randomNumber == 2) {
                    System.out.println("Computer chose Paper. YOU WIN.");
                    ++playerScore;
                } else {
                    System.out.println("Computer chose Scissor. ITS A TIE.");
                }
            } else { // if any invalid input is given.
                System.out.println("Please give a valid input.");
                i--; // decreasing the round number by 1 so that the round number remains same.
                continue; // used to execute the next iteration of the for loop.
            }
            if (i < 5) {// scores being displayed after each round except the final round
                System.out.println("Player Score : " + playerScore);
                System.out.println("Computer Score : " + computerScore);
            }
        }
        System.out.println("Final Player Score : " + playerScore);// total scores after final round.
        System.out.println("Final Computer Score : " + computerScore);
        if (playerScore > computerScore) {
            System.out.println("YOU WIN !!!! :)");
        } else if (playerScore < computerScore) {
            System.out.println("YOU LOSE. BETTER LUCK NEXT TIME.");
        } else {
            System.out.println("TIE");
        }
        sc.close();
    }
}