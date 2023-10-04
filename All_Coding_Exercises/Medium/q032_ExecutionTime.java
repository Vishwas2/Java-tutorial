package Exercises.All_Coding_Exercises.Medium;

public class q032_ExecutionTime {
    public static void main(String[] args) {
        System.out.println("This is a program that will check how much time in milliseconds it takes your code to execute.");
        long startTime = System.currentTimeMillis();
        // code here
        long endTime = System.currentTimeMillis();
        System.out.println("The time it took to execute is : " + (endTime - startTime) + " milli seconds");
    }
}
