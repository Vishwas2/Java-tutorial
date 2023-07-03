package Day_023_Practice_Question;
// Create an array of 5 floats and find their sum.

public class PracticeQuestion29 {
    public static void main(String[] args) {
        float[] num = { 12.3f, 34.5f, 56.7f, 78.9f, 90.1f };
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
