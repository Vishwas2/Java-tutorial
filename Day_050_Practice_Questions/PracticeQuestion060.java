package Day_050_Practice_Questions;
// Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods . Create another class
// SmartTelephone and demonstrate polymorphism.

abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
    public void greet(){
        System.out.println("Good morning !");
    }
}
class SmartTelephone extends Telephone{
    @Override
    public void ring() {
        System.out.println("Ringing...");
    }

    @Override
    public void lift() {
        System.out.println("Lifting...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting...");
    }
    public void type(){
        System.out.println("I am a smart telephone.");
    }
}
public class PracticeQuestion060 {
    public static void main(String[] args) {
        Telephone telephone = new SmartTelephone(); // This is runtime polymorphism / Dynamic method dispatch
        telephone.ring();
        telephone.lift();
        telephone.greet(); // we can access all the methods of the parent class
        telephone.disconnect();
        // telephone.type(); -> This will give error because of runtime polymorphism

        // The output of the above code is :
        // Ringing...
        // Lifting...
        // Good morning !
        // Disconnecting...
    }
}
// Basically in runtime polymorphism you can only access the methods of the parent class or the methods of the
// parent class which are overridden in the derived class. You cannot access the concrete method of the derived class.