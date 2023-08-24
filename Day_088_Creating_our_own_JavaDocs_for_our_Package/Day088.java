// Creating our own Java Documentation :
// Java documentation is great, it helps us get info about which method/ class/ Entity to use when. We can create our own
// packages documentation in Java.

// JavaDoc tool :
// javadoc command allows you to documentation in HTML format for our own package. Java provides tags for class or package
// to assist with the java doc generation.

package Day_088_Creating_our_own_JavaDocs_for_our_Package;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry.
 *
 * @author Vishwas
 * @version 0.1
 * @see <a href = "https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/reflect/Constructor.html">Java Docs</a>
 * @since 2004
 */

public class Day088 {
    public static void add(int a, int b) {
        System.out.println("The sum of the two numbers is : " + (a + b));
    }

    public static void main(String[] args) {
        add(21, 23);
    }
}
