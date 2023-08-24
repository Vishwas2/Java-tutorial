package Day_080_HashSet_in_Java;

import java.util.HashSet;

public class Day080 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();// by default the initial capacity is 16 and the load factor is 0.75
        // You can set the initial capacity and load factor yourself if you want
//        HashSet<Integer> hashSet1 = new HashSet<>(25,0.5f); -> Now the initial capacity is 25 and the load factor is 0.5
//        NOTE : The number that you have to enter for load factor is always a float otherwise it will give error.
        hashSet.add(6);
        hashSet.add(8);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(5); // Duplicate elements are not allowed in hashSet this will be treated as one 5 only.
        System.out.println(hashSet);
        // The output of the above code is :
        // [3, 5, 6, 8]
    }
}
