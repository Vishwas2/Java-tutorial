package Day_086_DateTimeFormatter_in_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day086 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // This is the date

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // This is the format
        // DateTimeFormatter helps us in printing the date in the way we want.
        String myDate = localDateTime.format(dateTimeFormatter);// using .format to set our date in the specified format(dd-MM-yyyy)
        System.out.println(myDate); // printing out myDate
        // The output of the above line of code is :
        // 22-08-2023

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate1 = localDateTime.format(dateTimeFormatter1);
        System.out.println(myDate1);
        // The output of the above line of code is :
        // 2023-08-22
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E"); // This will also print the first 3 letters of the day
        // There are a lot of shortcuts like this in the Java documentation.
        String date = localDateTime.format(dateTimeFormatter2);
        System.out.println(date);
        // The output of the above line of code is :
        // 22/08/2023 -- Tue
    }
}
// USING DATE TIME FORMATTER YOU CAN PRINT DATE AND TIME IN THE WAY YOU WANT.