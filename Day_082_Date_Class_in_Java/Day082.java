package Day_082_Date_Class_in_Java;

import java.util.Date;

public class Day082 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        // We can also use constructors provided by the date class.
        System.out.println(date.getTime()); // returns the number of milliseconds passed since 1 Jan 1970
        // All of the following methods are deprecated and are not recommended to use
        System.out.println(date.getDate()); // Deprecated method (not recommended to use)
        System.out.println(date.getDay()); // Deprecated method (not recommended to use)
        System.out.println(date.getYear()); // returns the number of years passed since 1900 (Deprecated method)
    }
}
