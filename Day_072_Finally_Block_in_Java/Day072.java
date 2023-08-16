package Day_072_Finally_Block_in_Java;

// The finally block contains the code which is always executed whether the exception is handled or not. It is used to
// execute code containing instructions to release the system resources, close a connection etc.

/*
In Java, the finally block is used in conjunction with the try and catch blocks to handle exceptions and perform cleanup
operations. The finally block contains code that is guaranteed to be executed, regardless of whether an exception is thrown or caught.

* Here's how the try, catch, and finally blocks work together:
Try Block: This is where you enclose the code that might throw an exception. If an exception occurs within the try block,
           the program will immediately jump to the corresponding catch block.

Catch Block: If an exception is thrown within the try block, the program searches for a matching catch block that can handle
             the specific type of exception. If a match is found, the code inside the catch block is executed. If no match
             is found, the exception will propagate up the call stack, and the program may terminate.

Finally Block: This block is used to place code that should always be executed, whether an exception occurred or not. It
               provides a way to perform cleanup tasks or ensure certain actions are taken, regardless of the outcome of the try and catch blocks.
 */
public class Day072 {
    public static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally { // finally will run no matter what (if an exception is encountered or not)
            System.out.println("Cleaning up resources... This is the end of this function.");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(greet());
        int a = 7;
        int b = 3;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("We have encountered an exception : " + e);
                break;
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        // The output of the above code is :
        /*
        java.lang.ArithmeticException: / by zero
        Cleaning up resources... This is the end of this function.
        -1
        2
        I am finally for value of b = 3
        3
        I am finally for value of b = 2
        7
        I am finally for value of b = 1
        We have encountered an exception : java.lang.ArithmeticException: / by zero
        I am finally for value of b = 0
         */
    }
}
