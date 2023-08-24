/*
java.time package :
-> Available from Java 8 onwards
-> Capable of storing even nanoseconds
Following are some of the most commonly used classes from java.time package :
1. LocalDate -> Represents a date
2. LocalTime -> Represents a time
3. LocalDateTime -> Represents a date + time
4. DateTimeFormatter -> Formatter for displaying and parsing date-time objects
 */

package Day_085_Java_Time_API_Classes_and_Methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Day085 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // The output of the above code is :
        // 2023-08-22
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // This even contains nanoseconds
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // This even contains nanoseconds
    }
}
