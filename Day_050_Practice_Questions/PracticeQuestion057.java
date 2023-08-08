package Day_050_Practice_Questions;
// Create an abstract class Pen with methods write() and refill() as abstract methods
abstract class Pen{
    abstract public void write();
    abstract public void refill();
    public void type(){
        System.out.println("I am a ball pen.");
    }
}
class Parker extends Pen{
    @Override
    public void write(){
        System.out.println("Writing...");
    }
    @Override
    public void refill(){
        System.out.println("Refilling...");
    }
}
public class PracticeQuestion057 {
    public static void main(String[] args) {
        Parker parker = new Parker();
        parker.write();
        parker.refill();
        parker.type();
        // The output of the above code will be :
        // Writing...
        // Refilling...
        // I am a ball pen.
    }
}
