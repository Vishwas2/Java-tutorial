package Day_041_Practice_Question;

// Create a class Rectangle and use inheritance to create another class Cuboid.
class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        length = 4;
        breadth = 5;
    }

    public void setLength(int length) {
        this.length = length;
        System.out.println("The length of the rectangle is now changed to : " + length);
    }

    public int getLength() {
        return length;
    }
}

class Cuboid extends Rectangle {
    int length;
    int breadth;
    int height;

    public Cuboid() {
        length = 5;
        breadth = 10;
        height = 10;
    }
}

public class PracticeQuestion054 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        System.out.println(cuboid.getLength());
        cuboid.setLength(5);
        System.out.println(cuboid.getLength());
        // The output of the above code will be :
        //4
        //The length of the rectangle is now changed to : 5
        //5
    }
}
