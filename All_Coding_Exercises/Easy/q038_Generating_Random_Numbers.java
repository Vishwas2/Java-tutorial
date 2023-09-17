package Exercises.All_Coding_Exercises.Easy;

import java.util.Random;
import java.util.Scanner;

public class q038_Generating_Random_Numbers {
    public static void main(String[] args) {
        System.out.println("This is a program to generate random numbers in java using random.");
        System.out.println("Enter the number of random numbers you want to generate : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Random random = new Random();
        System.out.println("The random numbers generated are : ");
        for (int i =0;i<input;i++){
            int temp = random.nextInt(0,101);
            System.out.println(temp);
        }
        scanner.close();
    }
}
