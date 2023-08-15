package Day_064_Practice_Questions;

// WAP to keep on printing "Thank You" and "Welcome" using threads. Add a sleep method in welcome thread to delay its execution
// for 200 millisecond.

class Thread3 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Thank You");
        }
    }
}
class Thread4 extends Thread{
    @Override
    public void run() {
        while(true){
        try {
            Thread.sleep(200);  // Thread will be delayed by 200 millisecond.
        } catch (InterruptedException e) {
            System.out.println(e);
        }
            System.out.println("Welcome");
        }
    }
}
public class PracticeQuestion067 {
    public static void main(String[] args) {
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        t3.start();
        t4.start();
    }
}
