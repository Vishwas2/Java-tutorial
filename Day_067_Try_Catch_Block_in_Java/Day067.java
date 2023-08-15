package Day_067_Try_Catch_Block_in_Java;

// EXCEPTIONS IN JAVA :
// An exception is an event that occurs when a program is executed disrupting the normal flow of instructions. There are
// mainly two types of exceptions in java :
// 1. Checked exceptions -> compile time exceptions(Handled by Compiler)
// 2. Unchecked exceptions -> runtime exceptions

// COMMONLY OCCURRING EXCEPTIONS :
// 1. Null Pointer exception
// 2. Arithmetic exception
// 3. Array Index out of bound exception
// 4. Illegal argument exception
// 5. Number format exception

// TRY - CATCH BLOCK IN JAVA :
/* format :
try{
// code to try }
catch(Exception){
// code if exception
}
 */
public class Day067 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // if we put the value of b as 0 in the above line then it will give us an arithmetic error for a/b, so :
        try {
            int c = a / b;
            System.out.println("The result is : " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide because of the reason : " + e);
        }
        // the output of the above code will be :
        // We failed to divide because of the reason : java.lang.ArithmeticException: / by zero
    }
}
