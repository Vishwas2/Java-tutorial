package Day_023_Practice_Question;
// Calculate the average marks from an array containing marks of all students in Maths using for each loop.

public class PracticeQuestion31 {
    public static void main(String[] args) {
        System.out.println("Program to calculate the average marks of students.");
        float[] marks = { 89.5f, 56f, 95.5f, 30.5f, 75f };
        float total = 0;
        for (float element : marks) {
            total = total + element;
        }
        float average = total / 5;
        System.out.println("The average marks of the students in Maths are : " + average);
        // The answer is coming out to be 69.3 which is correct.
        // You can improve the program by taking the number of students and their marks
        // as input like I did in the previous program.
    }
}
