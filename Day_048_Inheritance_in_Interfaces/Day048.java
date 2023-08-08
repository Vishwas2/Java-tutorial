package Day_048_Inheritance_in_Interfaces;

interface sampleInterface {
    void method1();

    void method2();

}

interface childSampleInterface extends sampleInterface { // This is the valid way to extend an interface and use inheritance
    void method3();

    void method4();
}

class SampleClass implements childSampleInterface { // now you have to override method 1,2,3 and 4

    @Override
    public void method1() { // public is very important otherwise it will give error
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }
}

public class Day048 {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.method1();
        sampleClass.method2();
        sampleClass.method3();
        sampleClass.method4();

        // The output of the above code is :
        // Method 1
        // Method 2
        // Method 3
        // Method 4
    }
}
