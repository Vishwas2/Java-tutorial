package Day_028_Practice_Questions;
// Write a Java method to print multiplication table of a number n.

public class PracticeQuestion37 {
    // Making a method called multiplicationTable
    static void multiplicationTable(int a) {
        // Applying for loop to print the multiplication table
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " X " + i + " = " + (a * i));
        }
    }

    public static void main(String[] args) {
        multiplicationTable(8);
    }
}
