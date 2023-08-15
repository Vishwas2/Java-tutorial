package Day_064_Practice_Questions;

// How do you get reference to the current thread in Java ?

class Thread6 extends Thread{
    @Override
    public void run() {
        System.out.println("I am thread6");
    }
}
public class PracticeQuestion070 {
    public static void main(String[] args) {
        Thread6 t6 = new Thread6();
        System.out.println(Thread.currentThread().getState());
        // The output of the above code is :
        // RUNNABLE
    }
}
