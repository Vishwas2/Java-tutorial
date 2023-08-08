package Day_050_Practice_Questions;
// Create an interface TVRemote and use it to inherit another interface SmartTVRemote.

interface TVRemote{
    public void increaseVolume();
    public void decreaseVolume();
}
interface SmartTVRemote extends TVRemote{ // You have to use extends to do inheritance in interfaces
    public void useAlexa();
    public void startYoutube();
}
class SonySmartRemote implements SmartTVRemote, TVRemote{

    @Override
    public void increaseVolume() {
        System.out.println("Increasing the volume...");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing the volume...");
    }

    @Override
    public void useAlexa() {
        System.out.println("Alexa is listening...");
    }

    @Override
    public void startYoutube() {
        System.out.println("Starting Youtube...");
    }
}
public class PracticeQuestion061 {
    public static void main(String[] args) {
        SonySmartRemote sonySmartRemote = new SonySmartRemote();
        sonySmartRemote.increaseVolume();
        sonySmartRemote.decreaseVolume();
        sonySmartRemote.useAlexa();
        sonySmartRemote.startYoutube();

        // The output of the above code is :
        // Increasing the volume...
        // Decreasing the volume...
        // Alexa is listening...
        // Starting Youtube...
    }
}
