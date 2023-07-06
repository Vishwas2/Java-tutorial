package Day_025_Method_Overloading;

/*Void return type :
 * When we don't want our method to return anything , we use void as return type.
 */
public class Day025 {
    static void change(int x) {
        x = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\nPlagiarism.");
    }
    // static method can be called without making an object.

    static void foo() {
        System.out.println("Good Morning bro !");
    }

    static void foo(int a) {
        System.out.println("The number you entered is : " + a);
    }

    static void foo(int a, int b) {
        System.out.println("The sum of the two numbers entered is : " + (a + b));
    }

    public static void main(String[] args) {
        tellJoke();
        // CASE 1 : Changing the integer
        int a = 54;
        change(a);
        System.out.println("The value of a after running change() is : " + a);
        // There will be no change in the value of a (it will remain 54)

        // CASE 2 : Changing the array
        int[] marks = { 52, 23, 78, 90, 45 };
        change2(marks);
        System.out.println("The value of marks[0] after running change2() is : " + marks[0]);
        // The value of marks[0] will change to 98
        // Because in the case of array the address is passed not a copy.

        ////////////////////////////////////////////

        // METHOD OVERLOADING :
        // Two or more methods can have the same name but different parameters. Such
        // methods are called Overloaded methods. For example :
        // void foo()
        // void foo (int a) => overloaded function foo
        // void foo (int a, int b)
        // NOTE : METHOD OVERLOADING CANNOT BE PERFORMED BY CHANGING THE RETURN TYPE OF
        // THE METHODS.

        foo();
        foo(10);
        foo(5, 3);
        // Here foo is an overloaded function
    }
}