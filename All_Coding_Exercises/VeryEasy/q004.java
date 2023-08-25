// create a java function to check whether two number are equal or not

package All_Coding_Exercises.VeryEasy;

public class q004 {
    static void equalOrNot(int firstNumber, int secondNumber){
        if(firstNumber== secondNumber){
            System.out.println("The two numbers are equal.");
        }
        else {
            System.out.println("The two numbers are not equal");
        }
    }
    public static void main(String[] args) {
        equalOrNot(12,13);
        equalOrNot(5,5);
    }
}
