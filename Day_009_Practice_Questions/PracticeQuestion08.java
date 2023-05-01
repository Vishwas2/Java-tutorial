
// use comparison operator to find out whether a given number is greater than the user entered number or not
import java.util.Scanner;

public class PracticeQuestion08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        if (a >= 10) {
            System.out.println("The given number is greater than or equal to 10");
        } else {
            System.out.println("The given number is smaller than 10");
        }
        sc.close();
    }
}
