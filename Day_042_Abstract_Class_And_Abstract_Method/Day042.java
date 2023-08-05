package Day_042_Abstract_Class_And_Abstract_Method;

// Abstract in english means -> existing in thought or as an idea without concrete existence.

// ABSTRACT METHOD : a method that is declared without an implementation
// For example : abstract void moveTo(double X,double Y)
// in the above case we have declared a method, but we have not written what it will do.

// ABSTRACT CLASS : If a class includes abstract methods, then the class itself must be declared abstract.
// The whole class becomes abstract even if it contains a single abstract method.
// For example :
// public abstract class PhoneModel{
//     abstract void switchOff();
// }

// You can create as many abstract methods as you like in an abstract class.
abstract class Base {
    public Base() {
        System.out.println("I am a constructor of Base.");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
    // Now the derived classes can implement this method to perform whatever task they want.
}

class Derived extends Base {
    // class 'Derived' must either be declared abstract or implement abstract method 'greet()' in 'Base'
    @Override
    public void greet() {
        System.out.println("Good morning !!!");
    }
}

abstract class Derived1 extends Base {
    // class 'Derived1' must either be declared abstract or implement abstract method 'greet()' in 'Base'
    public void bye() {
        System.out.println("Good Bye !!!");
    }
}

public class Day042 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.sayHello();
        derived.greet();
        // The output of the above code will be :
        // I am a constructor of Base.
        // Hello
        // Good morning !!!

        // YOU CANNOT CREATE AN OBJECT OF THE BASE CLASS
        // Base base = new Base(); <- THIS WILL GIVE AN ERROR
        // Derived1 derived1 = new Derived1(); <-THIS WILL ALSO GIVE AN ERROR
        Base base = new Derived(); // <- This is completely valid
        base.sayHello();
        base.greet();
        // The output of the above code will be :
        // I am a constructor of Base.
        // Hello
        // Good morning !!!
    }
}
// The use of abstract class and method with an example : suppose you make an abstract class phone and inside it you make
// an abstract method switchOn() then every company like samsung,one plus,apple,etc. can implement their own switchOn()
// method with different boot screens.

/*
The main uses of abstract classes and abstract methods in Java are as follows:

* Abstraction: Abstract classes allow you to define the structure and outline of a class without providing a complete implementation.
             This enables you to hide the internal details of a class and expose only the necessary behavior to the outside world.

* Encapsulation: By defining abstract methods, you can enforce certain behavior in the subclasses without knowing the exact implementation.
                 This promotes encapsulation, as you can hide the implementation details of methods within the subclasses.

* Code Reusability: Abstract classes can be used as a base class for multiple related subclasses.
                    They allow you to define common methods and fields in the abstract class,
                    which can be inherited by all its subclasses, promoting code reuse and reducing redundancy.

* Polymorphism: Abstract classes and methods facilitate polymorphism, as they allow you to create references of the abstract
                class type and use them to refer to the objects of its concrete subclasses. This enables you to achieve dynamic
                method dispatch, where the appropriate subclass method is invoked based on the actual type of the object.
*/
// Here's an example to illustrate the use of abstract classes and methods in Java:
/*
abstract class Shape {
    // Abstract method without implementation
    abstract double getArea();

    // Concrete method
    void printDetails() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.printDetails();
        System.out.println("Area of circle: " + circle.getArea());

        rectangle.printDetails();
        System.out.println("Area of rectangle: " + rectangle.getArea());
// THE OUTPUT OF THE ABOVE CODE WILL BE :
// This is a shape.
// Area of circle: 78.53981633974483
// This is a shape.
// Area of rectangle: 24.0
    }
}
 */