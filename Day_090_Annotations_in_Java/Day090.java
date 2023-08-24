// Annotations in Java are used to provide extra information about a program. Annotations provide metadata to class/methods.

// Following are some of the common annotations built into java :
// 1. @Override -> used to mark overridden methods in the child class.
// 2. @SuppressWarnings -> used to suppress the generated warnings by the compiler.
// 3. @Deprecated -> used to mark deprecated methods.
// 4. @FunctionalInterface -> used to ensure an interface is a functional interface.

package Day_090_Annotations_in_Java;

import java.util.ArrayList;

class Animal {
    void makeSound() {
        System.out.println("The animal is making sound...");
    }
}

class Dog extends Animal {
    @Override
        // Here @Override is telling the programmer that you are overriding makeSound method.
    void makeSound() {
        System.out.println("Dog is barking...");
    }
}

@FunctionalInterface // An interface which only contains one method is known as a functional interface.
interface myInterface {
    void hello();
}

public class Day090 {

    public static void main(String[] args) {
        Dog dog = new Dog();

    }
}
