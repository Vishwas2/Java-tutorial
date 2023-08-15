package Day_070_Exception_Class_in_Java;

import java.util.Scanner;

// EXCEPTION CLASS IN JAVA :
// We can write our custom exceptions using exceptions class in Java
// The exception class has the following important methods :
// 1. String toString() -> executed when sout(e) is ran
// 2. void printStackTrace() -> prints stack trace
// 3. String getMessage() -> prints the exception message
class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Day070 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
            // The output of the above code for the input 5 is :
            // I am getMessage()
            // I am toString()
            // I am toString()
        }
    }
}
