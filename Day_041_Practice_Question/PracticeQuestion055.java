package Day_041_Practice_Question;

// Create a class Circle and use inheritance to create another class Cylinder from it. Create methods for area and volume.
class Circle1 {
    int radius;

    public Circle1() {
        radius = 10;
    }

    public void area() {
        System.out.println("The area of the circle is : " + (3.14 * radius * radius));
    }
}

class Cylinder1 extends Circle1 {
    int height;
    int radius;

    public Cylinder1() {
        height = 5;
        radius = 10;
    }

    // Creating an overridden method area()
    @Override
    public void area() {
        System.out.println("The total surface area of the cylinder is : " + ((2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius)));
    }

    public void volume() {
        System.out.println("The volume of the cylinder is : " + (3.14 * radius * radius * height));
    }
}

public class PracticeQuestion055 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        circle1.area();
        Cylinder1 cylinder1 = new Cylinder1();
        cylinder1.area();
        cylinder1.volume();
        // The output of the above code will be : 
        //The area of the circle is : 314.0
        //The total surface area of the cylinder is : 942.0
        //The volume of the cylinder is : 1570.0
    }
}
