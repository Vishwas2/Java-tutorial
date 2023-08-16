// Write Java programs to demonstrate logical, syntax and runtime errors in Java.

// ANSWER :
/*
LOGICAL ERROR :
When there is something wrong with the logic of the program written by the programmer, it is known as logical error. The
program might run just fine without giving any error but it won't give the desired output.
// For example :
public class LogicalErrorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int sum = x - y; // Incorrect operation

        System.out.println("The sum of x and y is: " + sum);
    }
}
 */
/*
SYNTAX ERROR :
Syntax error occurs when there is a problem with the syntax of the code
// For example :
int a = 5 // This line will give syntax error because there is no semicolon at the end
 */
/*
RUNTIME ERROR :
Runtime errors occur during the execution of the program when something unexpected happens, such as division by zero or
trying to access an array index that is out of bounds.
// For example :
public class RuntimeErrorExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result = numerator / denominator; // Division by zero
        System.out.println("Result: " + result);
    }
}
 */