// Write a function that takes a string name and a number num (either 0 or 1) and return "Hello" + name if num is 1,
// otherwise return "Bye" + name. NOTE : the first letter of the name should always be capital.

package Easy;

public class q021_Say_Hello_and_say_Bye {
    // Creating a function to capitalise the first letter of the name :
    static String capitalise(String name) {
        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        String rest = name.substring(1);
        return (firstLetter + rest);
    }

    // Now creating the sayHelloBye function :
    static void sayHelloBye(String name, int zeroOrOne) {
        if (zeroOrOne == 0) {
            System.out.println("Hello " + capitalise(name));
        } else if (zeroOrOne == 1) {
            System.out.println("Bye " + capitalise(name));
        }
    }

    public static void main(String[] args) {
        sayHelloBye("Harry", 0);
        // The output of the above code is :
        // Hello Harry
    }
}
