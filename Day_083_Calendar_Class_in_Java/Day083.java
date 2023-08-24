// Calendar class is an abstract class

package Day_083_Calendar_Class_in_Java;

import java.util.Calendar;
import java.util.TimeZone;

public class Day083 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        // The output of the above code is : gregory
        // Gregorian calendar is used all around the world and has 12 months of 28-31 days each.
        System.out.println(calendar.getTimeZone());

        // Now suppose you want a specific time zone then :
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(calendar1.getTimeZone()); // this will give the time zone of singapore now
        System.out.println(calendar1.getTimeZone().getID()); // The output of this line of code is : Asia/Singapore
        System.out.println(calendar1.getTime());
    }
}
