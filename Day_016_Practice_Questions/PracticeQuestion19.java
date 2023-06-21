// WAP to find out the day of the week given the number 
// [1 for Monday, 2 for Tuesday, and so on...]
package Day_016_Practice_Questions;

import java.util.Scanner;

public class PracticeQuestion19 {
    public static void main(String[] args) {
        System.out.println("Enter the number from 1 to 7 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please give valid input");
                break;
        }
        sc.close();
    }
}
