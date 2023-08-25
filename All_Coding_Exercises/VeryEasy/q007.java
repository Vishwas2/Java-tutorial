// Create a function that takes the length and breadth of a rectangle as input and prints out its perimeter.

package All_Coding_Exercises.VeryEasy;

public class q007 {
    static void perimeterOfRectangle(int length,int breadth){
        System.out.println("The perimeter of the rectangle is : "+(2*(length+breadth)));
    }
    public static void main(String[] args) {
        perimeterOfRectangle(12,2);
    }
}
