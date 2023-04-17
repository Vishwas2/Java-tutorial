// precedence and associativity of operators
public class Day007 {
    public static void main(String[] args) {
        // Operators are evaluated on the basis of their precedence and associativity
        /*
         * First the precedence of the operators is checked and if multiple operators
         * have the same precedence then they are evaluated on the basis of
         * associativity(right to left or left to right).
         */
        int i = 1 + 5 * 3;
        // * has higher precedence + so the result would be 16.
        System.out.println(i);
    }
}