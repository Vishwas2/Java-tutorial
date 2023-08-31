// Create a method that accepts a string ( of a person's first and last name) and returns a string with the first and last
// names swapped

package easy;

import java.util.Scanner;

public class q006_Shuffle_the_Name {
    static String shuffleName(String name) {
        int position = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                position = i;
                break;
            }
        }
        String firstName = name.substring(position + 1);
        String secondName = name.substring(0, position);
        return (firstName + " " + secondName);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to swap a person's first and last names.");
        System.out.println("Enter a name :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(shuffleName(input));
        scanner.close();
    }
}
