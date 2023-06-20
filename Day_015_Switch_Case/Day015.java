package Day_015_Switch_Case;
// Switch Case statements in Java

// you can give integer, character, or string inside switch
// switch case can also be replaced with enhanced switch in Java(doesn't needbreak)
// Switch case is similar to else if statements
// Switch case is used when we have to make a choice between 
// a number of alternatives for a given variable
import java.util.Scanner;

public class Day015 {
    public static void main(String[] args) {
        System.out.println("Please enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are 18 years old.");
                break;
            // break is very important otherwise it will print everything below the matching
            // case

            default: // this will execute if none of the cases match the input
                System.out.println("You are not 18 years old.");
                break;
        }
        sc.close();
    }
}
