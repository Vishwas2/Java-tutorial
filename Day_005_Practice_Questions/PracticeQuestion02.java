// Write a program to calculate CGPA using marks of three subjects (out of 100).

import java.util.Scanner;

public class PracticeQuestion02 {
    public static void main(String[] args) {
        System.out.println("Program to calculate CGPA using marks of three subjects (out of 100)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the first subject :");
        float subject1 = sc.nextFloat();
        System.out.println("Enter marks of the first subject :");
        float subject2 = sc.nextFloat();
        System.out.println("Enter marks of the first subject :");
        float subject3 = sc.nextFloat();
        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println("Your CGPA is :");
        System.out.println(cgpa);
        sc.close();
    }
}
