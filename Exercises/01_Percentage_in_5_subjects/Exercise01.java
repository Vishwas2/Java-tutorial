// Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard.(Marks are out of 100)

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks in the subjects out of 100.");
        System.out.println("Enter marks in the first subject : ");
        float a = sc.nextFloat();
        System.out.println("Enter marks in the second subject : ");
        float b = sc.nextFloat();
        System.out.println("Enter marks in the third subject : ");
        float c = sc.nextFloat();
        System.out.println("Enter marks in the fourth subject : ");
        float d = sc.nextFloat();
        System.out.println("Enter marks in the fifth subject : ");
        float e = sc.nextFloat();
        float sum = a + b + c + d + e;
        float percentage = (sum / 500) * 100;
        System.out.println("Your percentage in the exam is :");
        System.out.println(percentage);
        sc.close();
    }
}