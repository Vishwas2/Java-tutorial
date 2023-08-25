// Write a function that takes in hours and converts them into seconds.

package All_Coding_Exercises.VeryEasy;

public class q006 {
    static void convertHoursToSeconds(int hours) {
        System.out.println(hours + " hours is equal to : " + (hours * 3600) + " seconds");
    }

    public static void main(String[] args) {
        convertHoursToSeconds(5);
    }
}
