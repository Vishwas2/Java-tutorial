/*WAP to find out whether a student is pass or fail,
if it requires total 40% and at least 33% in each subject to pass.
Assume 3 subjects and take marks as input from the user*/
package Day_016_Practice_Questions;

import java.util.Scanner;

public class PracticeQuestion17 {
    public static void main(String[] args) {
        System.out.println("This is a program to calculate whether you are pass or fail.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in the first subject (out of 100) :");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks in the second subject (out of 100) :");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks in the third subject (out of 100) :");
        int marks3 = sc.nextInt();
        int total = marks1 + marks2 + marks3;
        if (marks1 >= 33 && marks2 >= 33 && marks3 >= 33 && total >= 120) {
            System.out.println("Congratulations !!! You are pass.");
        } else {
            System.out.println("You have failed.");
        }
        sc.close();
    }
}
