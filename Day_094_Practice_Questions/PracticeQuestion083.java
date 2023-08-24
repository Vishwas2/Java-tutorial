// Create a class and add a method with deprecated annotation. Suppress the generated warning.
package Day_094_Practice_Questions;
class SampleClass {
    @Deprecated
    public void deprecatedBye(){
        System.out.println("Bye!");
    }
}
public class PracticeQuestion083 {
    @SuppressWarnings("deprecation") // The warning that the method we are using is deprecated is suppressed.
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.deprecatedBye();
    }
}
