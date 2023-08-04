package Day_041_Practice_Question;

// Create a class Circle and use inheritance to create another class Cylinder from it.
class Circle {
    int radius;

    // Creating constructor for the class Circle :
    public Circle() {
        radius = 5;
    }

    // Creating an overloaded constructor Circle :
    public Circle(int radius) {
        this.radius = radius;
        System.out.println("The radius of the circle is now : " + radius);
    }

    public void area() {
        System.out.println("The area of the circle is : " + 3.14 * radius * radius);
    }
}

class Cylinder extends Circle {
    int radius;
    int height;

    public Cylinder() {
        radius = 5;
        height = 10;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
        System.out.println("The radius of the Cylinder is now : " + radius + " and the height is : " + height);
    }

    // Making an overridden method area() :
    @Override
    public void area() {
        System.out.println("The total surface area of the cylinder is : " + ((2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius)));
    }
}

public class PracticeQuestion053 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
        Cylinder cylinder = new Cylinder();
        cylinder.area();
        //The output of the above code will be :
        // The area fo the circle is : 78.5
        // The total surface area of the cylinder is : 471.0
    }
}
