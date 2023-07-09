package Day_032_Practice_Questions;

// Create a class Rectangle with method to initialize its length and breadth, calculating area and perimeter.
public class PracticeQuestion47 {
    static class Rectangle {
        float length;
        float breadth;

        public void setLength(float l) {
            length = l;
            System.out.println("The length of the rectangle is now : " + l);
        }

        public void setBreadth(float b) {
            breadth = b;
            System.out.println("The breadth of the rectangle is now : " + b);
        }

        public float getArea() {
            return length * breadth;
        }

        public float getPerimeter() {
            return 2 * (length + breadth);
        }
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.breadth = 5;
        rec.length = 10;
        System.out.println("The area of the rectangle is : " + rec.getArea());
        System.out.println("The perimeter of the rectangle is : " + rec.getPerimeter());
        rec.setBreadth(2);
        rec.setLength(3);
        System.out.println("The area of the rectangle is : " + rec.getArea());
        System.out.println("The perimeter of the rectangle is : " + rec.getPerimeter());
    }
}
