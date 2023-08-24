package Day_076_ArrayList_in_Java;
// In Java, an ArrayList is a dynamic array-like data structure that can grow or shrink in size as elements are added or removed.

import java.util.ArrayList;

public class Day076 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); // ArrayList is like a modified array.
        l1.add(9);
        l1.add(0, 6);// you can also pass index along with the element you want to add. 0 is the index and 6 is the element.
        // now what happens if I add another element to index 0
        l1.add(0, 5); // 5 will now be moved to index 0 and 6 to index 1 which makes sense.
        l1.add(1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i)); // you cannot print the elements like you used to in array(arrayName[index]),
            // you have to use .get (arrayListName.get(index))
        }
        // The output of the above code is :
        // 5
        // 6
        // 9
        // 1
        ArrayList<Integer> l2 = new ArrayList<>(5); // the initial capacity of this array list is set to 5
        /*
        The initial capacity is essentially the size of the underlying array that ArrayList uses to store its elements.
        When you add elements to an ArrayList and its internal array becomes full, the ArrayList needs to allocate a larger
        array and copy the existing elements over. This process is called "resizing" or "rehashing." Resizing can be
        relatively expensive in terms of time and memory, so setting an appropriate initial capacity can help optimize
        performance in cases where you know roughly how many elements you'll be storing in the ArrayList.
         */
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        // now we can use addAll to add l2 array list to l1
        l1.addAll(0, l2); // l2 will be added to the beginning of l1 because we have given index 0, by default it is the last one
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        // The output of the above code is :
        /*
        10
        20
        30
        40
        50
        5
        6
        9
        1
         */
        // .clear() clears the entire array list
        // you can use .contains() to check whether an element is present in the array list or not. Return true if present otherwise false.
        // .indexOf() prints the index of the element
        // .set(index, element) method replaces the element at that index with the entered element.
    }
}
