package Day_064_Practice_Questions;

// Write a Java program to print "Thank You" and "Welcome" continuously on the screen using threads.
class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) { // Infinite loop
            System.out.println("Thank You");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        while (true) { // Infinite loop
            System.out.println("Welcome");
        }
    }
}

public class PracticeQuestion066 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
