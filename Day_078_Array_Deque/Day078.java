package Day_078_Array_Deque;

import java.util.ArrayDeque;

// Array Deque lets you insert or delete elements of the array from both left and right side
// In double ended queue (Deque) you can do insertion and deletion from any side
public class Day078 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(5);
        ad1.addFirst(7);
        for (int element : ad1) { // using for each loop to print the elements of the ArrayDeque ad1
            System.out.println(element);
        }
        System.out.println(ad1.getLast());
        // The output of the above code is :
        // 7
        // 6
        // 5
        // 5
    }
}
