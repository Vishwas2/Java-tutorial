package VeryEasy;


import java.util.Random;
import java.util.Scanner;

public class q021_Generate_Random_Numbers {
    public static void main(String[] args) {
        System.out.println("This is a program to generate random numbers between 0 and 100 (both inclusive).");
        System.out.println("Enter the amount of random numbers you want to generate : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] arr = new int[input];
        Random random = new Random();
        for (int i = 0; i < input; i++) {
            arr[i] = random.nextInt(0, 101);
        }
        System.out.println("The random numbers generated are : ");
        for (int element : arr) {
            System.out.println(element);
        }
        scanner.close();
    }
}
