package Day_064_Practice_Questions;

// Demonstrate getPriority() and setPriority() methods in Java threads
class SampleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class PracticeQuestion068 {
    public static void main(String[] args) {
        // getPriority() gives us the priority of the thread while setPriority() lets us change the priority of the thread.
        SampleThread sampleThread = new SampleThread();
        System.out.println("The current priority of the thread is : " + sampleThread.getPriority());
        sampleThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The priority of the thread is now : " + sampleThread.getPriority());
        // OUTPUT :
        // The current priority of the thread is : 5
        // The priority of the thread is now : 10
    }
}
