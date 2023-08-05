package Day_043_Introduction_to_Interfaces;

// Interface in English is a point where two systems meet and interact. For example, you can interact with you TV with the help of buttons.
// In Java interface is a group of related methods with empty bodies.
// AN EXAMPLE :
/*
interface Bicycle{
    void applyBrakes(int decrement);
    void speedUp(int increment);
    }
class FireFox implements Bicycle{
    int speed = 7;
    void applyBrakes(int decrement){
        speed = speed-decrement;
        }
    void speedUp(int increment){
        speed = speed + increment;
        }}
 */

// The difference between abstract and interfaces will be discussed in great detail in the upcoming days and when you should use which.
/*
In Java, an interface is a reference type that defines a contract or a set of abstract methods that a class must implement. It serves
as a blueprint for creating classes that adhere to a particular set of behaviors without specifying how these behaviors are implemented.
An interface is declared using the `interface` keyword and can also contain constants and default methods.

Here's an example of a simple Java interface:
public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

In this example, the `Shape` interface defines two abstract methods: `calculateArea()` and `calculatePerimeter()`.
Any class that implements this interface must provide concrete implementations of these two methods.

THE USES OF INTERFACES IN JAVA ARE AS FOLLOWS : 
1. **Achieving Multiple Inheritance**: Java supports single inheritance, meaning a class can extend only one superclass. However, 
   a class can implement multiple interfaces. This allows a class to inherit behaviors from multiple sources, promoting 
   flexibility in designing the class hierarchy.

2. **Creating a Contract**: Interfaces provide a way to enforce a contract or set of rules for classes that implement them.
   By defining a set of methods in an interface, you ensure that all implementing classes offer those methods, promoting
   consistency and clarity in the codebase.

3. **Polymorphism**: Interfaces enable polymorphism in Java. This means you can create variables of an interface type and 
   assign objects of different classes that implement the interface to those variables. This allows you to write code that
   works with different implementations of the same interface without knowing the specific implementation.

4. **Separation of Concerns**: Interfaces help separate the specification of behavior from the implementation details.
   By programming to interfaces rather than concrete classes, you can easily switch between different implementations 
   without affecting the rest of the codebase.

5. **Unit Testing**: Interfaces are valuable in unit testing, where you can create mock implementations of interfaces to
   test various parts of the code independently. This is especially useful when you want to isolate certain parts of the code for testing.

6. **Standardization**: Interfaces are often used to establish standards or conventions for third-party developers. 
   For example, Java provides many standard interfaces (e.g., `List`, `Set`, `Runnable`, etc.) that developers can use
   to ensure compatibility and interoperability with other libraries and frameworks.

Overall, interfaces are a powerful feature in Java that facilitates code reusability, flexibility, and maintainability in object-oriented programming.*/
