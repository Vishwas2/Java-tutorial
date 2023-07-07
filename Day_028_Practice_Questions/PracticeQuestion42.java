package Day_028_Practice_Questions;
// Write a method to find the average of a set of numbers passed as arguments 

public class PracticeQuestion42 {
    static void average(int... arr) {
        int sum = 0;
        int count = 0;
        for (int element : arr) {
            sum += element;
            count++;
        }
        int num = sum / count;
        System.out.println(num);
    }

    public static void main(String[] args) {
        average(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // The output of this code is coming out to be 5 which is correct.
    }
}
