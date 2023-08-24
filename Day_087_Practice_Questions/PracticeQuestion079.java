// Use the Calendar class in Java to print time in the following format :
// 21:47:02

package Day_087_Practice_Questions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class PracticeQuestion079 {
    public static void main(String[] args) {
        // Get the current time using Calendar
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Convert Calendar time components to LocalTime
        LocalTime currentTime = LocalTime.of(hour, minute, second);

        // Define the desired format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format the time using the formatter
        String formattedTime = currentTime.format(dateTimeFormatter);

        // Print the formatted time
        System.out.println(formattedTime);
    }
}