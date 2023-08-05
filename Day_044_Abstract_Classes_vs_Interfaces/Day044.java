package Day_044_Abstract_Classes_vs_Interfaces;
// First let us understand what abstract classes and interfaces do.

/* Abstract Classes -> a class that you cannot instantiate (you cannot create objects from an abstract class). Abstract
                       classes are those classes which contain one or more abstract methods(they might also contain concrete
                       methods inside them). The main reason to create an abstract class is that you want the subclasses to 
                       have certain parameters like name,age, etc. and the subclasses should also implement the abstract method,
                       or it must be an abstract class itself. To create a method or class abstract you just have to write 
                       abstract while creating it.
 */
abstract class Animal {
    String name;
    int age;

    public void printName() {
        System.out.println("My name is : " + name);
    }

    abstract public void makeNoise();
    // It makes sense for every animal to make noise but each and every animal has a different noise so we create the method abstract
    // Note here that we could also use method overriding to print out different noise for each animal but here it is compulsory to do so.
    // whereas in the case of method overriding it is upto the developer whether he wants to give every subclass makeNoise() method.
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }

    public void growl() {
        System.out.println("Growling...");
    }
}

/* Interface -> A class can be made interface class by writing interface while creating the class. In an interface all the
                methods are abstract methods, so you don't need to write abstract in front of the method name. You can
                implement as many interfaces as you want. All the fields declared inside the interface are static and final
                this means that you cannot change their value and all the classes that implement the interface have the
                same value of the fields.
 */
interface AnimalStuff {
    // Every field that's declared inside an interface is going to be static and final. Therefore
//    int age;
//    String name; -> BOTH OF THESE WILL GIVE ERROR
    int age = 10;
    String name = "Lucy";

    // every method in interface is abstract, so you don't need to write abstract in front of method name.
    public void poop();
}

class Cat implements AnimalStuff {
    @Override
    public void poop() {
        System.out.println("Pooping...");
    }
}

// YOU CAN DO BOTH EXTEND THE ANIMAL CLASS AND IMPLEMENT THE ANIMALSTUFF INTERFACE IF YOU WANT
//class Elephant extends Animal implements AnimalStuff -> this is completely valid

public class Day044 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 4; // You can set separate age and name for each class that extends the abstract class Animal
        dog.name = "harry";
        dog.printName();
        dog.makeNoise();
        dog.growl();
        Cat cat = new Cat();
        System.out.println(cat.name);
        /*
        The output of the above code is :
        My name is : harry
        Barking...
        Growling...
        Lucy
         */

//        cat.name= "jack"; -> THIS WILL GIVE ERROR(you cannot change fields declared in interface as they are final and static)
        // Also the name and age of all the class that implement the interface AnimalStuff will be the same.
        // So it doesn't make a lot of sense to have fields like these in interface that's why we have abstract classes.
    }
}
// The main differences between interface and abstract class are :
// * You can implement as many interface as you want in java, but you can only extend one class.
// * The fields in abstract classes can be changed whereas the fields in interfaces are final and static.
// * Abstract class doesn't support multiple inheritance whereas interface supports multiple inheritance.