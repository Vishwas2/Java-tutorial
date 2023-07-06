package Day_024_Methods;
// Sometimes our program grows in size and we want to separate the logic of main method to other methods

// for instance - If we are calculating average of a number pair 5 times, we can use methods to avoid repeating the logic
// DRY -> Don't Repeat Yourself
// Methods in Java are similar to functions in other languages.
// A method is a function written inside a class.
/* SYNTAX OF METHOD :
 * dataType name(){
 * // Method body
 * }
 */
/* Following method returns sum of two numbers :
 * int mySum (int a,int b){
 * int c = a+b;
 * return c;
 * }
 */

public class Day024 {
    // making a method is Java
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z; // returns the value of z
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // Day024 obj = new Day024(); // if the method is not static then you have to
        // create an object like this.
        int c;
        c = logic(a, b); // calling of static method
        // c = obj.logic(a,b); // calling of non static method
        System.out.println(c);
        // The output will be 40.
    }
}
