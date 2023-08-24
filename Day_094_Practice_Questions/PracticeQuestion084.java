// Create an interface and generate an instance from it.

package Day_094_Practice_Questions;

@FunctionalInterface
interface MyInterface {
    public void greet();
}

public class PracticeQuestion084 {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void greet() {
                System.out.println("Hello! How are you doing ?");
            }
        };
        myInterface.greet();
    }
}
