package Day_035_Practice_Question;

// Overload a constructor used to initialize a rectangle of length 4 and breadth 5 using custom parameters.
public class PracticeQuestion051 {
    static class Rectangle {
        int length;
        int breadth;

        public Rectangle() {
            length = 4;
            breadth = 5;
        }

        public Rectangle(int Length, int Breadth) { // An overloaded constructor
            length = Length;
            breadth = Breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        public int area() {
            return length * breadth;
        }

        public int perimeter() {
            return 2 * (length + breadth);
        }
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        // The length and breadth of the rectangle is automatically set to 4 and 5 respectively.
        System.out.println("The length of the rectangle is : " + rec.getLength());
        System.out.println("The breadth of the rectangle is : " + rec.getBreadth());
        System.out.println("The area of the rectangle is : " + rec.area());
        System.out.println("The perimeter of the rectangle is : " + rec.perimeter());
    }
}
