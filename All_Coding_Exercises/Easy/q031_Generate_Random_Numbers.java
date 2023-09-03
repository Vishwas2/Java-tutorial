// Create a function that takes in an integer input from the user and generates that number of random integers.

package Easy;

import java.util.Arrays;
import java.util.Random;

public class q031_Generate_Random_Numbers {
    static void random(int number) {
        int[] arr = new int[number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            arr[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        random(10);
        // the above code will return 10 randomly generated numbers between 0 and 100
    }
}
