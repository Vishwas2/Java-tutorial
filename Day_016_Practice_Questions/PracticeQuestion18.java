/*Calculate income tax paid by an employee to the government 
 * as per the slabs mentioned below :
 * INCOME SLAB  | TAX
 * 2.5L - 5L    | 5%
 * 5L - 10L     | 20%
 * Above 10L    | 30%
 */
package Day_016_Practice_Questions;

import java.util.Scanner;

public class PracticeQuestion18 {
    public static void main(String[] args) {
        System.out.println("Program to calculate the amount of tax payable to the government.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly income in lakhs :");
        float income = sc.nextFloat();
        if (income < 2.5) {
            System.out.printf("You don't have to pay any tax.");
        } else if (2.5 <= income && income <= 5) {
            System.out.printf("Your payable tax is : %.2f lakhs", income * 0.05);
        } else if (5 < income && income <= 10) {
            System.out.printf("Your payable tax is : %.2f lakhs", income * 0.2);
        } else if (income > 10) {
            System.out.printf("Your payable tax is : %.2f lakhs", income * 0.3);
        }
        sc.close();
    }
}
