package VeryEasy;

import java.util.Scanner;

public class q019_Simple_Interest {
    public static void simpleInterest(int principalAmount, double annualRateOfInterest, int timeInYears) {
        double rate = annualRateOfInterest / 100;
        double simpleInterest = principalAmount * rate * timeInYears;
        System.out.println("The simple interest is : " + simpleInterest);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate simple interest.");
        System.out.println("Enter the principal amount : ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        System.out.println("Enter the annual rate of interest : ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period in years :");
        int time = scanner.nextInt();
        simpleInterest(principal, rate, time);
        scanner.close();
    }
}
