// Create a function that takes the base price of a product and discount percentage and returns the final price after
// subtracting the discount.

package easy;

import java.util.Scanner;

public class q007_Find_the_Discount {
    static double finalPrice(double basePrice, double discount) {
        double discountAmount = (discount * basePrice) / 100;
        return basePrice - discountAmount;
    }

    public static void main(String[] args) {
        System.out.println("This is a program to calculate the final price of a product after discount.");
        System.out.println("Enter the price of the product before discount : ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("Enter the discount percentage : ");
        double discount = scanner.nextDouble();
        System.out.println("The final price of the product after removing after discount is : ");
        System.out.println(finalPrice(price, discount));
        scanner.close();
    }
}
