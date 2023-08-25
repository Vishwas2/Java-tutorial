// Write a function convert() that takes in minutes and converts them into seconds.

package All_Coding_Exercises.VeryEasy;

public class q002 {
    static void convert(int minutes) {
        System.out.println(minutes + " minutes is equal to : " + minutes * 60 + " seconds");
    }

    public static void main(String[] args) {
        convert(5);
    }
}
