// WAP to find out whether a year entered by the user is leap year or not.
package Day_016_Practice_Questions;

import java.util.Scanner;

public class PracticeQuestion20 {
    public static void main(String[] args) {
        System.out.println("Program to check whether a specific year is leap year or not.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a specific year : ");
        int year = sc.nextInt();
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        sc.close();
    }
}
