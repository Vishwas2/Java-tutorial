// IF ELSE CONDITIONALS IN JAVA

/*If and else helps us to make basic decisions in the program just like life 
for example : if hungry the eat food, else if thirsty then drink water, else do nothing*/

// SAMPLE QUESTION :
// WAP to take age as input from the user and check whether he can drive or not

package Day_013_If_Else_Conditionals;

import java.util.Scanner;

public class Day013 {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can drive a car if you have a driver's license.");
        } else {
            System.out.println("You cannot drive a car.");
        }
        sc.close();
    }
}
