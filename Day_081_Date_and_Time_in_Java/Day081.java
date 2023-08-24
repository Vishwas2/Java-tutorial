package Day_081_Date_and_Time_in_Java;
// Java.time -> package for date and time in Java (From Java 8 onwards)
// Before Java 8, java.util.package was uses to hold the date and time classes. Now these classes are deprecated.

/*
HOW JAVA STORES A DATE ?
Date in Java is stored in the form of a long number. This long number holds the number of milliseconds passed since 1 Jan 1970.
Java assumes that 1900 is the start year which means it calculates year passed since 1900 whenever we ask it for years passed.
System.currentTimeMillis() returns number of milliseconds passed. Once number of milliseconds are calculated, we can calculate minutes,
seconds and year passed.
 */
public class Day081 {
    public static void main(String[] args) {
        System.out.println("Number of milliseconds passed since 1 January 1970 are : " + System.currentTimeMillis());
        // the above code gives out the number of milliseconds passed since 1 January 1970.
// QUICK QUIZ :
// Is it safe to store the number of milliseconds in a variable of type long ?
// ANSWER : yes it is very safe to store the number of milliseconds in a variable of long type because long can contain a
//          value as large as 9223372036854775807.

        System.out.println(Long.MAX_VALUE);
    }
}

