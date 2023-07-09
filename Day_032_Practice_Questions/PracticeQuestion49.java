package Day_032_Practice_Questions;

// Create a class Circle with a method to initialize its radius, calculating area, perimeter, etc.
public class PracticeQuestion49 {
    static class Circle {
        float radius;

        public void setRadius(float n) {
            radius = n;
            System.out.println("The radius of the circle is now : " + n);
        }

        public float getArea() {
            return (3.14f * radius * radius);
        }

        public float getPerimeter() {
            return (2f * 3.14f * radius);
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 10f;
        System.out.println("The area of the circle is : " + circle.getArea());
        System.out.println("The perimeter of the circle is : " + circle.getPerimeter());
        circle.setRadius(1f);
        System.out.println("The area of the circle is : " + circle.getArea());
        System.out.println("The perimeter of the circle is : " + circle.getPerimeter());
    }
}
