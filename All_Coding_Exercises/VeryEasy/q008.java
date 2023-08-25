// Create a function that takes voltage and current and returns the calculated power (power = voltage*current).
package All_Coding_Exercises.VeryEasy;

public class q008 {
    static void power(int voltage, int current) {
        System.out.println("The power is : " + (voltage * current));
    }

    public static void main(String[] args) {
        power(10, 20);
    }
}
