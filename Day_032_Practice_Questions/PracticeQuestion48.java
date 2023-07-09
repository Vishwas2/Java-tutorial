package Day_032_Practice_Questions;

// Create a class TommyVecetti for Rockstar Games capable of hitting(print hitting...), running, firing, etc.
public class PracticeQuestion48 {
    static class TommyVecetti {
        public void hit() {
            System.out.println("Hitting...");
        }

        public void run() {
            System.out.println("Running...");
        }

        public void fire() {
            System.out.println("Firing...");
        }
    }

    public static void main(String[] args) {
        TommyVecetti tv = new TommyVecetti();
        tv.fire();
        tv.hit();
        tv.run();
    }
}
