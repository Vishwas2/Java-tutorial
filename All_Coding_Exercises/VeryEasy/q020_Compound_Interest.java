package VeryEasy;

import java.util.Scanner;

public class q020_Compound_Interest {
    public static void compoundInterest(int principalAmount, double rateOfInterest, int numberOfTimesInterestCompoundsInOneYear,
                                        int numberOfYears) {
        double rate = rateOfInterest / 100;
        double p = principalAmount * Math.pow(1 + (rate / numberOfTimesInterestCompoundsInOneYear), numberOfTimesInterestCompoundsInOneYear * numberOfYears);
        double ci = p - principalAmount;
        System.out.println("The compound interest is : " + ci);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate compound interest.");
        System.out.println("Enter the principal amount : ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        System.out.println("Enter the annual interest rate : ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the number of times the interest is compounded per year : ");
        int noOfTimesCompounded = scanner.nextInt();
        System.out.println("Enter the number of years the money is invested : ");
        int noOfYears = scanner.nextInt();
        compoundInterest(principal, rate, noOfTimesCompounded, noOfYears);
        scanner.close();
    }
}
