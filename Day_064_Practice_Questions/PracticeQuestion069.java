package Day_064_Practice_Questions;

// How do you get state of a given thread in Java ?

class Thread5 extends Thread {
    @Override
    public void run() {
        System.out.println("I am a thread.");
    }
}

public class PracticeQuestion069 {
    public static void main(String[] args) {
        // To get the state of a given thread in Java we can use the getState() method.
        Thread5 t5 = new Thread5();
        System.out.println("The state of thread t5 is : " + t5.getState());
        t5.start();
        System.out.println("The state of the thread t5 now is : " + t5.getState());
        // OUTPUT :
        // The state of thread t5 is : NEW
        // The state of the thread t5 now is : RUNNABLE
        // I am a thread.
    }
}
