package Day_035_Practice_Question;

// Create a class Sphere and use getters and setters to set its radius.
public class PracticeQuestion052 {
    static class Sphere {
        int radius;

        public int getRadius() {
            return radius;
        }

        public void setRadius(int Radius) {
            radius = Radius;
            System.out.println("The radius is now changed to : " + radius);
        }
    }

    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.radius = 10;
        System.out.println("The radius of the sphere is : " + sphere.getRadius());
        sphere.setRadius(100);
    }
}
