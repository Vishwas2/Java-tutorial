// Use the java.time API to print time in the following format :
// 21:47:02 -> 24 hour clock style time

package Day_087_Practice_Questions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PracticeQuestion077 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = localTime.format(dateTimeFormatter);
        System.out.println(time);
    }
}
