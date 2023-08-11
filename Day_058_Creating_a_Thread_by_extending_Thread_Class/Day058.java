package Day_058_Creating_a_Thread_by_extending_Thread_Class;
// Arguments VS Parameters :
// Arguments are actual.
// For example : int a = 5; here a is the parameter and 5 is the argument.
// Arguments and parameters are often used interchangeably.

// Concurrency VS Parallelism :
// Parallelism is the task of running multiple computations simultaneously.
// Concurrency is the task of running AND managing computations at the same time.

// We can run multiple threads concurrently in java.
class myThread1 extends Thread{ // you have to use extends Thread class if you want to do threading.
    @Override
    public void run(){
        int i =0;
        while(i<40000){
        System.out.println("My thread1 is running.");
        System.out.println("I am happy.");
        i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
        System.out.println("My thread2 is running.");
        System.out.println("I am sad.");
        i++;
        }
    }
}

public class Day058 {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1(); // This will automatically execute the run() method in myThread1
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
        // The output of the above code will be like :
        /*
        My thread1 is running.
        I am happy.
        My thread2 is running.
        I am sad.
        // it will keep on printing until the while loop is terminated and there is no fixed pattern in which it will run
        // the threads, but it will run them both of them concurrently.
         */
    }
}
