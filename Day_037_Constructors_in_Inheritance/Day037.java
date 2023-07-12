package Day_037_Constructors_in_Inheritance;

class Base {
    Base() {
        System.out.println("I am Base class constructor.");
    }

    // making an overloaded constructor :
    Base(int n) {
        System.out.println("I am an overloaded constructor with the value of n as : " + n);
    }

    public int x;

    public void setX(int x) {
        System.out.println("I am in Base and setting x now.");
        this.x = x;
        System.out.println("The value of x is now " +
                x);
    }
}

class Derived extends Base {
    Derived() {
        // super(0); // super keyword is used if you want to run the Base(int n) constructor
        // In the above code the value of n in the overloaded base constructor will be 0.

        System.out.println("I am Derived class constructor.");
    }

    Derived(int x, int y) {
        super(x); // the value of x is passed onto Base(int n) constructor.
        System.out.println("I am an overloaded derived constructor with the value of y as : " + y);
    }
}

class childOfDerived extends Derived {
    childOfDerived() {
        System.out.println("I am a child of Derived constructor.");
    }

    childOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of childOfDerived with the value of z as : " + z);
    }
}

public class Day037 {
    public static void main(String[] args) {
        // POINT 1 :
        // when you run derived class constructor, the constructor of the base class will also run (base class constructor
        // will run before derived class constructor).

        // POINT 2 :
        // the derived class can access the getters and setters of the base class but the reverse is not true.

        //
        Derived d = new Derived();
        d.setX(23);
        // When the above code is run , the output is :
        // I am Base constructor.
        // I am Derived constructor.
        // I am in Base and setting x now.
        // The value of x is now 23

        // As you can see by default the Base constructor without any arguments is run.
        // But if you want the base(int n) constructor to run then you can use the super keyword.
        // For example : you can use super keyword inside Derived constructor and also put an int inside it
        // This way you can create multiple overloaded base constructors and use the super keyword to choose which one to execute.
        // You can also create multiple overloaded derived constructors and based on the number of arguments that you pass
        // the correct derived constructor will get executed.

        Derived d1 = new Derived(10, 15);
        // The output of the above code will be :
        // I am an overloaded constructor with the value of n as : 10
        // I am an overloaded derived constructor with the value of y as : 15

        childOfDerived cd = new childOfDerived(1, 2, 3);
        // the above code will give the following output :
        // I am an overloaded constructor with the value of n as : 1
        // I am an overloaded derived constructor with the value of y as : 2
        // I am an overloaded constructor of childOfDerived with the value of z as : 3

    }
}
