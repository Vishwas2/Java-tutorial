package Day_041_Practice_Question;

// Create a class Rectangle and use inheritance to create another class Cuboid. Create methods for area and volume, also
// create getters and setters
class Rectangle1 {
    int length;
    int breadth;

    public void area() {
        System.out.println("The area of the rectangle is : " + (length * breadth));
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}

class Cuboid1 extends Rectangle1 {
    int length;
    int breadth;
    int height;

    @Override
    public void area() {
        System.out.println("The area of the cuboid is : " + (2 * ((length * breadth) + (breadth * height) + (height * length))));
    }

    public void volume() {
        System.out.println("The volume of the cuboid is : " + (length * breadth * height));
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }
}

public class PracticeQuestion056 {
    public static void main(String[] args) {
        Rectangle1 rectangle1 = new Rectangle1();
        rectangle1.setLength(10);
        rectangle1.setBreadth(5);
        rectangle1.area();
        Cuboid1 cuboid1 = new Cuboid1();
        cuboid1.setLength(10);
        cuboid1.setBreadth(5);
        cuboid1.setHeight(10);
        cuboid1.area();
        cuboid1.volume();
        // The output of the above code is :
        // The area of the rectangle is : 50
        // The area of the cuboid is : 400
        // The volume of the cuboid is : 500
    }
}
