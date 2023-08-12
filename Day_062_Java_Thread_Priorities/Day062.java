package Day_062_Java_Thread_Priorities;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thank You " + this.getName());
        }
    }
}

public class Day062 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("First");
        MyThread t2 = new MyThread("Second");
        MyThread t3 = new MyThread("Third");
        MyThread t4 = new MyThread("Fourth");
        MyThread t5 = new MyThread("Fifth");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // When you run the above code the output will be something like :
        // Thank You Third
        // Thank You Fifth
        // Thank You Second
        // Thank You First
        // Thank You Fourth
        // Note that the order in which these are printed is completely random, and it will most probably change if I rerun the program.
        // But what if there is some task that has a higher priority than others.
        // You can set the priority of the tasks in Java. The task which has the higher priority will be executed first.
        // There are 3 Types of priorities in Java :
        // 1. Max priority
        // 2. Normal priority
        // 3. Min priority
        // In order to set the priority you can use the setPriority() method like threadName.setPriority(Thread.MAX_PRIORITY)
        // NOTE : WHICH THREAD GETS EXECUTED IS HIGHLY DEPENDENT ON THE OS.
        MyThread t6 = new MyThread("Most Important task");
        t6.setPriority(Thread.MAX_PRIORITY);
        t6.start();
        // Now ideally more priority will be given to t6, and it will be run more. (you cannot rely too much on these priorities
        // as they are set by the operating system)
    }
}
