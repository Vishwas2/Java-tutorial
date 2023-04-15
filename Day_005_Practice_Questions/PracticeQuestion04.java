// Write a Java program to convert kilometers in miles.

import java.util.Scanner;

public class PracticeQuestion04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers :");
        float a = sc.nextFloat();
        float miles = a * 0.621371f;
        System.out.print(a + " kilometers into miles is :");
        System.out.println(miles);
        sc.close();
    }
}
