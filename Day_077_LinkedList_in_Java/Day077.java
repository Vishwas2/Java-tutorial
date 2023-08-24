package Day_077_LinkedList_in_Java;

import java.util.LinkedList;

public class Day077 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
//        LinkedList<Integer> l3 = new LinkedList<>(5) -> This statement will give an error as you cannot give initial capacity in linked list.
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1, 566);
        for (int element : l1) {
            System.out.println(element);
        }
    }
}
// There are some special methods in LinkedList which are not available in ArrayList like :
// .addLast -> adds an element to the last index value of the LinkedList
// .addFirst -> adds an element to the starting index of the LinkedList