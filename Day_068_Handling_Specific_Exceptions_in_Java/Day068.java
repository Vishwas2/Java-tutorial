package Day_068_Handling_Specific_Exceptions_in_Java;

import java.util.Scanner;

// HANDLING SPECIFIC EXCEPTIONS :
// In Java, we can handle specific exceptions by typing multiple catch blocks.
/*
try{
    // code
}
catch(IO Exception e){ -> handles all the exceptions of type IO Exception
    // code
}
catch(Arithmetic Exception e){ -> handles all the exceptions of type Arithmetic Exception
    // code
}
catch(Exception e){ -> handles all other exceptions
    // code
}
 */
public class Day068 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 9;
        marks[2] = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int input = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is : " + marks[input]);
            System.out.println("The value of array value divided by number is : " + marks[input] / number);
// multiple exceptions can occur in this code like ArrayIndexOutOfBound exception or the number given by the user to divide is 0.
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred !");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bounds exception occurred !");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occurred !");
            System.out.println("The exception which occurred is : " + e);
        }
    }
}
// This is how we can handle specific exceptions in Java.