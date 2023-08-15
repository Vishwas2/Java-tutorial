package Day_063_Thread_Methods;

// Today we will learn about join() and interrupt() method
// There are a lot of thread methods in java and if you want to learn them in detail you can use the java documentation.
class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5000) {
            System.out.println("Thank You.");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 5000) {
            System.out.println("Welcome.");
            i++;
        }
        // INTERRUPT METHOD :
        /*
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}

public class Day063 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
//        t1.start();
//        t2.start();
        // The above code will keep on printing Thank You. and Welcome. in random order
        // Java will execute both t1 and t2 but if you want that t2 should start after t1 is finished, you can use join() method.
//        t1.start();
//        t1.join(); -> this will give error if used like this because this throws Interrupted Exception
//        t2.start();
        // Interrupted exception = If any thread has interrupted the current thread. The interrupted status of the current
        //                         thread is cleared when this exception is thrown.

        // WE HAVE TO USE TRY CATCH WITH JOIN() METHOD LIKE THIS :
        /*
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();*/
        // In the above code first t1 will be executed and after t1 is complete, t2 will start executing.
        t1.start();
        t2.start();

        // INTERRUPT METHOD : The interrupt() method of thread class is used to interrupt the thread. If any thread is in
        // sleeping or waiting state (i.e. sleep() or wait() is invoked) then using the interrupt() method, we can interrupt
        // the thread execution by throwing InterruptedException.
    }
}
