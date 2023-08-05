package Day_039_Method_Overriding;

// If the child class implements the same method present in the parent class again, it is known as method overriding.
class A {
    public void meth1() {
        System.out.println("I am method 1 of class A.");
    }

    public void meth2() {
        System.out.println("I am method 2 of class A.");
    }
}

class B extends A {
    @Override
    // THIS IS NOT COMPULSORY(BUT RECOMMENDED) TO WRITE BUT IS WRITTEN FOR CLARITY AND PROGRAMMER'S CONVENIENCE.
    // NEVER WRITE @Override WITHOUT ACTUALLY OVERRIDING OTHERWISE IT WILL GIVE ERROR
    public void meth2() {
        System.out.println("I am method 2 of class B.");
    }

    // this is called method overriding
    // now when we write b.meth2 , it will execute this method instead of the meth2 method in class A
    // This is very useful during app development.
    // class B has inherited everything from class A except meth2().


    /*THE FOLLOWING IS AN EXAMPLE OF METHOD OVERLOADING NOT METHOD OVERRIDING : 
    public void meth2(int a){
        System.out.println("This is method overloading and i am an overloaded method with the value of a as : "+a);
    }*/

    //    @Override THIS WILL GIVE ERROR AS THERE IS NO METHOD OVERRIDING IN meth3.
    public void meth3() {
        System.out.println("I am method 3 of class B.");
    }
}

public class Day039 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth1();
        b.meth2();
        b.meth3();
        // The output of the above code will be :
        // I am method 2 of class A.
        // I am method 1 of class A.
        // I am method 2 of class B.
        // I am method 3 of class B.
    }
}
// Method overriding should never be confused with method overloading
// Method overloading is when you have two or more methods with the same name but different parameters and perform different functions
// whereas method overriding is when you inherit everything from a class except a specific method.