package VeryEasy;

public class q033_Leap_Year_or_not {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program to check whether a specific year is a leap year or not.");
        int year = 2024;  // Change this to the year you want to check
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}