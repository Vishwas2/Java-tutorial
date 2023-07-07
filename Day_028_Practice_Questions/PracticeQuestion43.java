package Day_028_Practice_Questions;
// Write a funciton to convert celsius into fahrenheit.

public class PracticeQuestion43 {
    static void celsiusToFahrenheit(float n) {
        float fahrenheit = (float) ((n * 1.8) + 32);
        System.out.println(fahrenheit);
    }

    public static void main(String[] args) {
        celsiusToFahrenheit(56.8f);
    }
}
