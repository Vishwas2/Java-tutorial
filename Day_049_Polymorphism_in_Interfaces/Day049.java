package Day_049_Polymorphism_in_Interfaces;

// Polymorphism -> One thing many forms (for example smartphone can be used as a camera , GPS, media player, etc.)
// Polymorphism is very helpful in android development, and we can understand it with the help of a real life example that
// when you give your phone to your friend to listen to music at that time the phone is acting as a media player and you don't
// want your friend to read your messages or view your photos. Similarly, polymorphism allows you to put a lock on the
// other methods(photos and messages in the above case) and the person can only use the method of the interface which they
// are allowed to (media player in the above case).

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

    public void sampleMethod() {
        System.out.println("This is a sample method.");
    }

    public class Day049 {
        public static void main(String[] args) {
            Camera camera = new MySmartPhone(); // This is a smartphone but use it as a camera
            // Similar to Dynamic method dispatch / runtime polymorphism in inheritance
            // camera.getNetworks(); -> This will give error
            // camera.sampleMethod(); -> This is also not allowed
            // You can understand this with the example that if you give your phone to your friend to take photo then you will
            // not want him to look at your messages or view your photos etc. and neither will he do that. Similarly,  in the
            // above code the camera object can access only the methods inside camera. In this type of situation polymorphism
            // is very helpful. This is very useful in android app development.
            camera.takeSnap();
            camera.recordVideo();
            camera.record4kVideo();
            // The output of the above code will be :
            // Taking snap...
            // Recording video...
            // Good morning
            // Recording in 4k...
            Wifi wifi = new MySmartPhone(); // This can only use Wi-Fi methods
            MySmartPhone mySmartPhone = new MySmartPhone();
            // This can use all the methods including methods in myCellPhone because it extends that class (because this is the complete smartphone)
        }
    }
}
// REMEMBER -> Runtime polymorphism and polymorphism in interfaces is similar to one another, but they are not the same.