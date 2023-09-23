package Exercises.All_Coding_Exercises.VeryEasy;

class Fibonacci {
    static int length;
    // length is the number of fibonacci numbers you want to print out
    // now we will create getters and setters for length

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        Fibonacci.length = length;
    }

    Fibonacci() {
        System.out.println("I am a default constructor.");
    }

    Fibonacci(int length) {
        Fibonacci.length = length;
        System.out.println("The length is now : " + length);
    }

    static void printFibonacciSequence() {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < length; i++) {
            int num3 = num1 + num2;
            System.out.println(num1);
            num1 = num2;
            num2 = num3;
        }
    }
}

public class q036_Fibonacci_Sequence_using_Constructors {
    public static void main(String[] args) {
        System.out.println("This is a program to print out the fibonacci sequence using constructors.");
        Fibonacci fibonacci = new Fibonacci();
        Fibonacci f = new Fibonacci(10);
        Fibonacci.printFibonacciSequence();

        // The output of the above code is :
        /*
        I am a default constructor.
        The length is now : 10
        0
        1
        1
        2
        3
        5
        8
        13
        21
        34
*/
    }
}
