// Create a class and add a method with deprecated annotation. What are its effects on program execution?

package Day_094_Practice_Questions;
class MyClass{
    @Deprecated
    public void deprecatedHello(){
        System.out.println("Hello!");
    }
}
public class PracticeQuestion082 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.deprecatedHello();
        // The effect is that the program will run just fine but you will get a warning that you are using a deprecated method.
    }
}
