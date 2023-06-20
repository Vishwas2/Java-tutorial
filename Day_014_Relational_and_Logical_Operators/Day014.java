package Day_014_Relational_and_Logical_Operators;
// RELATIONAL AND LOGICAL OPERATORS IN JAVA

// Some of the examples of ralational operators are :
// ==, >=, <, >, <=, !=

// Some of the examples of logical operators are :
// && (and), || (or), ! (not)

// AND evaluates to true if both the conditions are true
// OR evaluates to true if any one of the conditions is true

public class Day014 {
    public static void main(String[] args) {
        System.out.println("For logical AND...");
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a && b && c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For logical OR...");
        if (a || b || c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
