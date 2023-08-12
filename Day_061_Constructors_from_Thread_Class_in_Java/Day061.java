package Day_061_Constructors_from_Thread_Class_in_Java;

// BELOW ARE THE COMMONLY USED CONSTRUCTORS OF THE THREAD CLASS :
// 1. Thread()
// 2. Thread(String name)
// 3. Thread(Runnable r)
// 4. Thread(Runnable r, String name)

// Creating thread by extending Thread class :
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("I am a Thread");
    }
}

// Creating thread by implementing Runnable interface :
class MyThreadRunnable implements Runnable{
    // You cannot use constructors to give name to the threads made by implementing the runnable interface.

    @Override
    public void run() {
        System.out.println("I am a runnable thread");
    }
}
public class Day061 {
    public static void main(String[] args) {
        MyThread Thread1 = new MyThread("Vishwas");
        MyThread Thread2 = new MyThread("Adi");
        Thread1.start();
        // There are various methods that we can use with threads in Java like : getId, getName, getState, etc.
        // You can get the id of the thread by using getId() method.
        System.out.println("The id of Thread1 is : " + Thread1.getId());
        System.out.println("The name of Thread1 is : " + Thread1.getName());
        System.out.println("The state of Thread1 is : " + Thread1.getState());
        System.out.println("The id of Thread2 is : " + Thread2.getId());
        System.out.println("The name of Thread2 is : " + Thread2.getName());
        System.out.println("The state of Thread2 is : " + Thread2.getState());
        // The output of the above code is :
        /*
        I am a Thread
        The id of Thread1 is : 22
        The name of Thread1 is : Vishwas
        The state of Thread1 is : TERMINATED
        The id of Thread2 is : 23
        The name of Thread2 is : Adi
        The state of Thread2 is : NEW
         */

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread Thread3 = new Thread(myThreadRunnable, "Aditya"); // Here we can give the name to our thread.
        System.out.println("The id of Thread3 is : "+Thread3.getId());
        System.out.println("The name of Thread3 is : "+Thread3.getName());
        System.out.println("The state of Thread3 is : "+Thread3.getState());
        // The output of the above code is :
        // The id of Thread3 is : 24
        // The name of Thread3 is : Aditya
        // The state of Thread3 is : NEW
    }
}
