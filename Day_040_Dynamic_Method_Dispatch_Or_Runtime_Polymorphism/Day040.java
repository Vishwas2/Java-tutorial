// DYNAMIC METHOD DISPATCH / RUNTIME POLYMORPHISM
package Day_040_Dynamic_Method_Dispatch_Or_Runtime_Polymorphism;

//dynamic method dispatch in Java means that when you have a class (let's call it the parent class) with a method,
//and you create a subclass that overrides that method, Java will use the overridden method from the subclass when
//you call the method on an object of the subclass. You cannot use the other methods of the subclass.
class Phone {
    public void on() {
        System.out.println("Turning on Phone...");
    }

    public void greet() {
        System.out.println("Good Morning !!!");
    }
}

class SmartPhone extends Phone {
    @Override
    public void on() {
        System.out.println("Turning on Smart Phone...");
    }

    public void bye() {
        System.out.println("Good Bye !!!");
    }
}

public class Day040 {
    public static void main(String[] args) {
        Phone phone = new SmartPhone(); // This is completely valid and won't give any error.
        // THIS IF ONLY TRUE IF REFERENCE IS OF SUPERCLASS AND OBJECT IS OF SUBCLASS (THE REVERSE IS FALSE)
        // SmartPhone smartPhone = new Phone();  <- THIS WILL GIVE AN ERROR
        // REFERENCE OF SUPERCLASS CAN BE EQUAL TO OBJECT OF SUBCLASS BUT THE REFERENCE OF SUBCLASS CANNOT BE EQUAL TO OBJECT OF SUPERCLASS
        // you can understand it by the example that every smartphone is a phone but every phone is not a smartphone
        // or by the example that every dog is an animal but every animal isn't a dog.
        phone.greet();
        phone.on();// The output of this will be "Turning on Smart Phone..." because the object is of SmartPhone class.
        // ALWAYS IN THIS CASE THE METHOD OF THE OBJECT IS RUN (WHICH IS SMARTPHONE IN THE ABOVE CASE)
        // phone.bye(); -> This will give an error.
    }
}
// ANOTHER EXAMPLE OF RUNTIME POLYMORPHISM :
/*
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: Dog barks.
        animal2.makeSound(); // Output: Cat meows.
    }
}
 */