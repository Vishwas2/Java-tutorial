package Day_019_Practice_Questions;

// WAP to calculate the sum of the numbers occuring in the multiplication table of 8.
import java.util.Scanner;

public class PracticeQuestion28 {
    public static void main(String[] args) {
        System.out.println("Program to print out the sum of multiples of 8.");
        System.out.println("Enter how many numbers do you want to add : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int multiple;
        int sum = 0;
        while (num > 0) {
            multiple = num * 8;
            sum = sum + multiple;
            num--;
        }
        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
