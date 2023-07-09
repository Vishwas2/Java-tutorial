// Inheritance is used to borrow properties and methods from an existing class
// Phone -> Smartphone (Smartphone extends Phone)
// Super Class -> Sub Class (Subclass extends Superclass)

// DECLARING INHERITANCE IN JAVA :
// Inheritance in Java is declared using extends keyword
// For example : Subclass extends the Superclass

// Code Example :
// public class Dog extends Animal {
// code
// }
package Day_036_Inheritance;

class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base { // Declaring inheritance.
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Day036 {
    public static void main(String[] args) {
        // Creating an object of Base class
        Base base = new Base();
        base.setX(4);
//        base.setY(5); -> this will give an error.
        System.out.println(base.getX());
        // The above code will print out "I am in base and setting x now" and 4 in the next line.

        // Creating an object of Derived class
        Derived derived = new Derived();
        derived.setX(5);
        System.out.println(derived.getX());
        derived.setY(7);
        System.out.println(derived.getY());
        // The above code will print out "I am in base and setting x now" and 5 in the next line.
        // THE IMPORTANT THING HERE IS THAT DERIVED CAN USE setX AND getX METHODS BECAUSE OF INHERITANCE.
        // WE CANNOT ACCESS Y FROM BASE BECAUSE IT ONLY CONTAINS X.
    }
}
// Some more examples of inheritance are :
// 1. Vehicle -> Car
// 2. Vehicle -> Truck
// 3. Animal -> Dog
// 4. Animal -> Cat

// Java doesn't support multiple inheritance i.e. two classes cannot be superclass for a subclass.