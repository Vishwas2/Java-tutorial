package VeryEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class q016_Largest_of_all {
    public static void main(String[] args) {
        System.out.println("This is a program that keeps on taking input from the user until 0 is entered and then prints" +
                " out the largest number among all the numbers entered");
        System.out.println("Please enter the numbers :");
        int input = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (input != 0) {
            input = scanner.nextInt();
            arrayList.add(input);
        }
        int max = arrayList.get(0);
        for (int element : arrayList) {
            if (max < element) {
                max = element;
            }
        }
        System.out.println("The maximum number among all the numbers entered is : " + max);
        scanner.close();
    }
}
