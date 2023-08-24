// Create a Set in Java. Try to store duplicate elements inside this Set and verify that only one instance is stored

package Day_087_Practice_Questions;

import java.util.HashSet;

public class PracticeQuestion080 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        System.out.println(hashSet);
        // The output of the above line of code is :
        // [1, 2, 3]
        // This proves that in Set only one instance is stored
    }
}
