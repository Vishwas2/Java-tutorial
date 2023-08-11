package Day_059_Creating_a_Thread_using_Runnable_Interface;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<10000){
        System.out.println("Hello !");
        i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<10000) {
            System.out.println("Bye !");
            i++;
        }
    }
}
public class Day059 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
//        bullet1.start() -> This will give an error. We can do this when creating thread by extending thread class but not here.
        gun1.start();
        gun2.start();
        // The above code will print Hello ! and Bye ! randomly until the loop terminates
    }
}
// We can create threads in java by both the methods creating thread by extending thread class and creating thread by using
// runnable interface both of these methods have some advantages and disadvantages
/*
CREATING A THREAD BY EXTENDING THREAD CLASS :
* Advantages :
1. Simple and convenient to use, especially for simple applications.
2. Directly represents a thread, so you don't need to create an additional object for the task.

* Disadvantages :
1. Java doesn't support multiple inheritance, so if you extend Thread, your class can't inherit from any other class.
2. Threads are created by subclassing, which might not align well with the principle of separating concerns (e.g., mixing thread logic with business logic).
 */

/*
CREATING A THREAD BY USING RUNNABLE INTERFACE :
* Advantages :
1. Allows you to separate the thread logic from the class hierarchy, promoting better code organization.
2. You can implement multiple interfaces if needed, overcoming Java's limitation on multiple inheritance.

* Disadvantages :
1. Requires a bit more code compared to extending the Thread class.
2. Involves creating an additional object (Thread) to manage the thread execution.
 */