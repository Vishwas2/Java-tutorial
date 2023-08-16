package Exercises;

// You have to create a custom calculator with following operations :
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// which throws the following exception :
// 1. Input Mismatch Exception
// 2. Arithmetic Exception
// 3. Maximum input Exception (if any of the input is greater than 100000)
// 4. Max multiplier reached exception (don't allow any multiplication input to be greater than 7000)


import java.util.InputMismatchException;
import java.util.Scanner;

class MaximumInputException extends Exception {
    public MaximumInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

public class Custom_Calculator {
    static void customCalculator() {
        try {

            System.out.println("Please enter the first number : ");
            Scanner scanner = new Scanner(System.in);
            float number1 = scanner.nextFloat();
            System.out.println("Please enter the second number : ");
            float number2 = scanner.nextFloat();
            System.out.println("Please enter the operator (+,-,*,/) : ");
            String operator = scanner.next();
            if (number1 > 100000 || number2 > 100000) {
                throw new MaximumInputException("The maximum input that you can give is 100000.");
            }
            if ((number1 > 7000 || number2 > 7000) && operator.equals("*")) {
                throw new MaxMultiplierReachedException("The maximum number that can be used in multiplication is 7000.");
            }
            if (operator.equals("+")) {
                System.out.println("The sum of the two numbers is : " + (number1 + number2));
            } else if (operator.equals("-")) {
                System.out.println("The difference between the two numbers is : " + (number1 - number2));
            } else if (operator.equals("*")) {
                System.out.println("The product of the two numbers is : " + (number1 * number2));
            } else if (operator.equals("/")) {
                System.out.println("The result of the division of the two numbers is : " + (number1 / number2));
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception encountered : " + e);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid input.");
        } catch (MaximumInputException | MaxMultiplierReachedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a custom calculator which can do addition(+), subtraction(-), division(/) and multiplication(*)");
        customCalculator();
    }
}
