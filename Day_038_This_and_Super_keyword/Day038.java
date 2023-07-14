// THIS KEYWORD :
// this is a way for us to reference an object of the class which is being created / referenced.
// this.area = 2;  -> this is a reference to current object.

// SUPER KEYWORD :
// A reference variable used to refer immediate parent class object.
// -> Can be used to refer immediate parent class instance variable.
// -> Can be used to invoke parent class methods.
// -> Can be used to invoke parent class constructors.

package Day_038_This_and_Super_keyword;

class Sample {
    int a;

    public int getA() {
        return a;
    }

    Sample() {
        System.out.println("I love coding.");
    }

    Sample(int a) {
        this.a = a;
        // The use of this is extremely important if you use the same variable names like in the above example.
        // if you don't use this in the above example, the program will get confused and not give the desired output.
    }

    public int returnOne() {
        return 1;
    }

}

class Derived extends Sample {
    Derived(int c) {
        super(c);
        System.out.println("I am a Constructor.");
    }
}

public class Day038 {
    public static void main(String[] args) {

        Sample s = new Sample(5);
        System.out.println(s.getA());
        // The output of the above code will be 5
        // if we don't use this in the above code then the output will be 0.
        Derived d = new Derived(5);
        System.out.println(s.getA());
    }
}
