// Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz"
//• If the number is a multiple of 3 the output should be "Fizz"
//• If the number given is a multiple of 5, the output should be "Buzz"
//• If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz"
//• If the number is not a multiple of either 3 or 5, the number should be output on its own.
//• The output should always be a string even if it is not a multiple of 3 or 5.

package easy;

public class q009_FizzBuzz {
    static String FizzBuzz(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
    public static void main(String[] args) {
        System.out.println(FizzBuzz(6));
        System.out.println(FizzBuzz(10));
        System.out.println(FizzBuzz(15));
        System.out.println(FizzBuzz(7));
        /*
        The output of the above code is :
        Fizz
        Buzz
        FizzBuzz
        7
         */
    }
}
