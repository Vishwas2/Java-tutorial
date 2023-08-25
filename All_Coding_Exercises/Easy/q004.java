// Create a function that can do basic calculation. The function takes two numbers and an operator and prints out the result.
// For example : calculator(12,2,'*') -> 24

package All_Coding_Exercises.Easy;

public class q004 {
    static void calculator(int firstNumber, int secondNumber, String operator) {
        if (operator.equals("*")) {
            System.out.println("The product of the two number is : " + (firstNumber * secondNumber));
        } else if (operator.equals("+")) {
            System.out.println("The sum of the two number is : " + (firstNumber + secondNumber));
        } else if (operator.equals("-")) {
            System.out.println("The difference between the two numbers is : " + (firstNumber - secondNumber));
        } else if (operator.equals("/")) {
            System.out.println("The result of the division of the two numbers is : " + (firstNumber - secondNumber));
        } else if (operator.equals("%")) {
            System.out.println("The remainder is : " + (firstNumber % secondNumber));
        }
    }
    public static void main(String[] args) {
        calculator(5,5,"+");
        calculator(5,5,"-");
        calculator(5,5,"*");
        calculator(5,5,"/");
        calculator(5,5,"%");
    }
}
