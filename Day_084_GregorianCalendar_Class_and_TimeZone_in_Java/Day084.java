// GregorianCalendar class is a concrete class.

package Day_084_GregorianCalendar_Class_and_TimeZone_in_Java;

import java.util.Calendar;
import java.util.GregorianCalendar;
// GregorianCalendar Class :
// This class is used to create an instance of gregorian calendar. We can change the year, month and date using set method.

/*
CALENDAR CLASS METHODS :
1. get method is used to get year, date, min, sec
    a.get(Calendar.SECOND)
    a.get(Calendar.MINUTE)
    a.get(Calendar.DATE)
    a.get(Calendar.YEAR)
2. get time method returns a date object
3. Other methods can be looked up from the Java docs
 */
public class Day084 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.isLeapYear(2023)); // returns true if the entered year is a leap year

        // TIME ZONE
        // TimeZone class is used to create time zones in Java. Some of the important methods of TimeZone class are :
        // getAvailableIDs() -> get all available IDs supported
        // getDefault() -> get the default timezone
        // getID() -> get id of a timezone

    }
}
