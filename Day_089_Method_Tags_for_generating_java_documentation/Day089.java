package Day_089_Method_Tags_for_generating_java_documentation;

/**
 * TAGS FOR METHODS :
 * Javadoc provides following tags for methods :
 * 1. @param -> for describing parameters of a method
 * 2. @return -> for describing about the return value
 * 3. @throws -> for describing exceptions thrown
 * 4. @deprecated -> for describing deprecated status
 */
public class Day089 {
    /**
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        // IMPORTANT NOTE :
        // /* is for normal comment whereas /** is comment for javadoc
    }

    public int add(int a, int b) throws Exception {
        if (a == 0) { // just an assumption
            throw new Exception();
        }
        int c;
        c = a + b;
        return c;
    }
    /**
     * Hello this is a method.
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of the two numbers as an integer
     * @throws Exception if a is zero
     * @deprecated This method is deprecated please use + operator
     */
}
