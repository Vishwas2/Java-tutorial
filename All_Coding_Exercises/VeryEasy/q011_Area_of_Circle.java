package VeryEasy;

import java.util.Scanner;

public class q011_Area_of_Circle {
    public static void main(String[] args) {
        System.out.println("This is a program to calculate the area of a circle in Java .");
        System.out.println("Enter the radius of the circle whose area you want to calculate :");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println("The area of the circle is : " + (Math.PI * radius * radius));
        scanner.close();
    }
}
