package Day_032_Practice_Questions;

// Create a class Cellphone with methods to print "ringing...", "vibrating..." etc.
public class PracticeQuestion45 {
    static class Cellphone {
        public void ring() {
            System.out.println("Ringing...");
        }

        public void vibrate() {
            System.out.println("Vibrating...");
        }
    }

    public static void main(String[] args) {
        Cellphone samsung = new Cellphone();
        samsung.ring();
        samsung.vibrate();
    }
}
