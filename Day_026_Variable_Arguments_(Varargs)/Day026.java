// VARARGS IS VERY USEFUL IF WANT TO GIVE MULTIPLE VARIABLE INPUTS TO A METHOD

// A funtion with Varargs can be created in Java using the following syntax :
// public static void foo(int ...arr){
//     // arr is available here as int[] arr
// }
// foo can be called with zero or more arguments like this : 
// foo(7)
// foo(7,8,9)
// foo(1,2,7,8,9)

public class Day026 {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    static int sum(int... arr) {
        // Available as int[] arr
        int result = 0;
        // Using for each loop :
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    // IF YOU WANT THE USER TO GIVE AT LEAST ONE INPUT THEN :
    static int sum1(int x, int... arr) { // HERE X IS COMPULSORY
        // Atleast one integer is required now
        // Available as int[] arr
        int result = 0;
        // Using for each loop :
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Turorial.");
        System.out.println("The sum of 4 and 5 is : " + sum(56, 34));
        // This will not give any error and give output 90
        // but if want to add 3 numbers now then we have to make a new method
        // if we also want to add 4 numbers we have to create a new method
        // this is a very tiring process and we can use varargs to make our lives
        // easier.
        System.out.println("The sum of 12, 34, 56 and 349 is : " + sum(12, 34, 56, 349));
        // the method sum can take all of the inputs that you give without giving any
        // error. The inputs are passed as an array to the method sum and then you can
        // whatever you want with the elements of the array.

        // GIVING NOTHING AS INPUT :
        // IN THE SUM METHOD :
        System.out.println("The sum of nothing is : " + sum());
        // The output will be 0 as an empty array will be passed onto the method.

        // IN THE SUM1 METHOD :
        // System.out.println("The sum of nothing is : " + sum1());
        // This will give an error as you must give asleast one input argument.

    }
}
