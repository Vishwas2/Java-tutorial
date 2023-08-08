package Day_050_Practice_Questions;

// create an abstract class Pen with abstract methods write() and refill(). Now use this pen class to create a concrete
// class FountainPen with additional method changeNib()
abstract class Pen1 {
    abstract public void write();

    abstract public void refill();
}

// Concrete class
class FountainPen extends Pen1 {
    @Override
    public void write() {
        System.out.println("Writing...");
    }

    @Override
    public void refill() {
        System.out.println("Refilling...");
    }

    public void changeNib() {
        System.out.println("Changing the nib of the pen...");
    }
}

public class PracticeQuestion058 {
    public static void main(String[] args) {
        FountainPen fountainPen = new FountainPen();
        fountainPen.changeNib();
        fountainPen.refill();
        fountainPen.write();
    }
}
