package Day_032_Practice_Questions;
// Create a class Square with a method to initialize its side, calculating area, perimeter etc.

public class PracticeQuestion46 {
    static class Square {
        float side;

        public void setSide(float n) {
            side = n;
            System.out.println("The side of the square is changed to : " + n);
        }

        public float getArea() {
            float area;
            area = side * side;
            return area;
        }

        public float getPerimeter() {
            float perimeter;
            perimeter = 4 * side;
            return perimeter;
        }
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 5f;
        System.out.println("The area of a square of side 5 is : " + sq.getArea());
        System.out.println("The perimeter of a square of side 5 is : " + sq.getPerimeter());
        sq.setSide(4f);
        System.out.println("The area of a square of side 4 is : " + sq.getArea());
        System.out.println("The perimeter of a square of side 4 is : " + sq.getPerimeter());
    }
}
