package Day_046_Interface_Examples_and_Default_Methods;

// An interface can have static or default methods. Default method enable us to add new functionality to existing Interfaces.
// This feature was introduced in Java 8 to ensure backward compatibility while updating an interface.
// Classes implementing the interface need not implement the default methods.
// Interfaces can also include private methods for default methods to use.
/*
**Default methods in Java** allow you to add new methods to an interface, which is like a blueprint for classes.
  Before Java 8, interfaces could only have method declarations (like empty promises) that classes had to implement.

With default methods, you can provide a **default implementation** (a method body with code) inside the interface itself.
This means that if a class implements the interface but doesn't provide its own implementation of a default method,
it automatically gets the default code from the interface.

* Here's an analogy:

Think of an interface as a rulebook that defines certain methods (instructions) that a class must implement.
Before, this rulebook could only have blank pages where the classes needed to write the instructions themselves.

With default methods, the rulebook can have pre-written instructions for some methods. So, if a class follows the
rulebook and doesn't write its own instructions for a particular method, it just uses the default instructions from the rulebook.

This is helpful because it allows us to add new methods to interfaces in the future without breaking old code. Classes
that already followed the rulebook (implemented the interface) automatically get the new methods because they have default implementations.
However, if a class wants to write its own version of a method, it can still do that and override the default implementation.

Default methods are like a way of evolving the rulebook without forcing everyone to change their code.
They provide more flexibility and enable backward compatibility.
 */
interface Camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        // The classes implementing this method won't be able to use it because it is private
        // Then you might think what is the use of this method
        // The use of private method is that default method inside the interface can use it.
        System.out.println("Good morning");
    }

    // If you add another method after already implementing the interface the class implementing the interface will give
    // error unless you also override the newly created method.
    // IN SUCH SITUATIONS DEFAULT METHODS ARE EXTREMELY USEFUL.
    default void record4kVideo() {
        greet(); // using private method greet()
        // All the classes will be able to use this default method without overriding(you can override if you want).
        System.out.println("Recording in 4k...");
    }
    // The above default method will not give any error in the classes implementing the interface
    // You can override this default method if you want, but it is not compulsory.
    // The classes implementing this interface will be able to use this method

}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi, Camera {

    @Override
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Vishwas", "Adi", "Airtel"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class Day046 {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();
        mySmartPhone.record4kVideo();
        String[] ar = mySmartPhone.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        // The output of the above code is :
        // Good morning
        // Recording in 4k...
        // Getting list of networks
        // Vishwas
        // Adi
        // Airtel
    }
}
// You cannot create default method inside abstract classes.