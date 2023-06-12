package Day_010_Strings;

// A String in Java is a sequence of characters
// Sring is a class in Java (it isn't a primitive datatype)
// Strings are immutable in Java and cannot be changed
// String can be created in using the following two methods:
// 1. String name = new String("Vishwas")
// 2. String name = "Vishwas"

import java.util.Scanner;

public class Day010 {
    public static void main(String[] args) {
        String name1 = new String("Vishwas");
        String name2 = "Rana";
        System.out.println(name1);
        System.out.println(name2);
        System.out.printf("The value of name1 is : %s\n", name1);
        // in the above line of code %s is used becuse we want to print a string
        // for int -> %d, float -> %f, char -> %c, string -> %s
        System.out.printf("The value of name2 is : %s\n", name2);
        // Taking a string as input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name :");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}

// Different ways to print in Java :
/*
 * 1. System.out.print() -> no new line at the end
 * 2. System.out.println() -> prints a new line at the end
 * 3. System.out.printf() -> same as the printf used in c
 * 4. System.out.format()
 */