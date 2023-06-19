package Day_012_Practice_Questions;
// Write a Java program to name with username in the message "Dear <|name|>, thanks a lot."

import java.util.Scanner;

public class PracticeQuestion13 {
    public static void main(String[] args) {
        System.out.println("Please enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Dear " + name + ", thanks a lot.");
        sc.close();
    }
}
