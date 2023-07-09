package Day_035_Practice_Question;

// Create a class Cylinder and use getters and setters to set its radius and height.
// also create methods inside the class to calculate the total surface area and volume of the cylinder.
public class PracticeQuestion050 {
    static class Cylinder {
        int radius;
        int height;

        public Cylinder() {// making a constructor
            radius = 10;
            height = 10;
        }

        public Cylinder(int Radius, int Height) { // you can create setters instead of constructors if you want
            radius = Radius;
            height = Height;
        }

        public int getHeight() {
            return height;
        }

        public int getRadius() {
            return radius;
        }

        public float totalSurfaceArea() {
            float area = 2f * 3.14f * radius * (radius + height);
            return area;
        }

        public float volume() {
            float volume = 3.14f * radius * radius * height;
            return volume;
        }
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        // because we have made a constructor the value of the height and radius is automatically set to 10 and 10 respectively.
        System.out.println("The height of the cylinder is : " + cy.getHeight());
        System.out.println("The radius of the cylinder is : " + cy.getRadius());
        System.out.println("The total surface area of the cylinder is : " + cy.totalSurfaceArea());
        System.out.println("The volume of the cylinder is : " + cy.volume());
    }
}
