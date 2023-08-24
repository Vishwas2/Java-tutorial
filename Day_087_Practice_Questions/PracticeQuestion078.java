// Use the Date class in Java to print out time in the following format :
// 21:47:02

package Day_087_Practice_Questions;

import java.util.Date;

public class PracticeQuestion078 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
        // The output of the above line of code will be like :
        // 21:47:02
    }
}
