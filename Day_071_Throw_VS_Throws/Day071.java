package Day_071_Throw_VS_Throws;

// THROW KEYWORD :
// The throw keyword is used to explicitly throw an exception within a method.
/*
if(b==0) {
    throw new ArithmeticException("Dividing by 0 not allowed"):
    }
else {
    return a/b;
    }
 */

// THROWS KEYWORD :
// The throws keyword is used in a method's declaration to indicate that the method might throw certain types of exceptions
// during its execution.
/*
public void calculate (int a, int b ) throws IO Exception{
    // code
}
 */
import java.util.InputMismatchException;
import java.util.Scanner;

// Throws signals that the method might throw an exception
public class Day071 {
    // making a custom exception :
    static class NegativeRadiusException extends Exception {
        @Override
        public String toString() {
            return "Radius cannot be negative !";
        }

        @Override
        public String getMessage() {
            return "Radius cannot be negative !";
        }
    }

    public static float area(int radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        return (float) Math.PI * radius * radius;
        // The area will come out to be negative if the radius supplied is negative which cannot be possible.
        // To counter this problem we define a custom exception.
    }

    static int divide(int a, int b) throws ArithmeticException { // Throws here signal that this method might throw Arithmetic exception.
        // now whoever is using this method has to make changes so that it doesn't throw Arithmetic Exception.
        // If Vishwas wanted he could have also put the given code in try and catch block to do exception handling.
        return a / b;
    }

    public static void main(String[] args) {
        // Shivam -> uses divide() function made by Vishwas
        // Shivam is using try catch to take care of the Arithmetic exception
        try {
            int c = divide(6, 0);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("The program encountered arithmetic exception");
        }
//        System.out.println(area(45)); -> This will give error and display the message unhandled exception
        try {
            System.out.println("Enter the radius of the circle : ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            System.out.println("The area of the circle is : " + area(input));
        } catch (InputMismatchException e) {
            System.out.println("Please enter the valid input.");
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("The program encountered an exception. The exception encountered is : " + e);
        }
    }
}
