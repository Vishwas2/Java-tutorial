/* ANONYMOUS CLASS:
In Java, an anonymous class is a class that is declared and instantiated at the same time, without providing a separate
explicit class declaration. It's typically used for creating a one-time-use class that extends an existing class or implements
an interface.

Anonymous classes are often used in scenarios where you need to create a small, localized piece of functionality, such as
event handlers, callback functions, or custom comparators, without the need to create a separate class for it. They are
particularly useful when you need to define a class for a single instance, and you don't want to clutter your code with
additional class definitions.
 */

/* LAMBDA EXPRESSIONS:
In Java, lambda expressions are a feature introduced in Java 8 as part of the Java SE 8 release. They provide a concise
way to represent anonymous functions, which can be treated as objects and passed around in your code. Lambda expressions
are primarily used to enhance the programming paradigms of functional programming and to simplify the usage of interfaces
with a single abstract method (functional interfaces).
 */
package Day_091_Java_Anonymous_Classes_and_Lambda_Expressions;

@FunctionalInterface
interface HornBicycle {
    void blowHorn();
}

// Instead of writing the following code and implementing the interface, I can use anonymous class.
class AnonymousDemo implements HornBicycle {
    public void display() {
        System.out.println("Hello.");
    }

    @Override
    public void blowHorn() {
        System.out.println("Blowing horn...");
    }
}

public class Day091 {
    public static void main(String[] args) {
        HornBicycle hornBicycle = new HornBicycle() { // This is an anonymous class
            @Override
            public void blowHorn() {
                System.out.println("Hello");
            }
        };
        hornBicycle.blowHorn();
        // The output of the above line of code is : Hello

        HornBicycle hornBicycle1 = new AnonymousDemo();
        hornBicycle1.blowHorn();

        // What we did in the above two lines of code could also have been done with the help of Lambda Expressions like :
        HornBicycle obj = () -> {
            System.out.println("Using lambda expression");
        };
        obj.blowHorn();
        // The output of the above line of code is : Using lambda expression
    }
}
