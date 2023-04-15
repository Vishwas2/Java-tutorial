import java.util.Scanner;

// Improting Scanner class from java.util package.
public class Day004 {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        // Creating a new Scanner object to read input from the console.
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        // Reads an integer input from the console and stores it in variable a.
        // We can use sc.nextFloat() to take a floating number as input.
        // We can use sc.next() to take a word as input.
        // We can use sc.nextLine() to take a string as input.
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        // Reads an integer input from the console and stores it in variable b.
        int sum = a + b;
        System.out.println("The sum of these numbers is : ");
        System.out.println(sum);
        sc.close();
        // Closing the Scanner object to avoid resource leak.
    }
}
