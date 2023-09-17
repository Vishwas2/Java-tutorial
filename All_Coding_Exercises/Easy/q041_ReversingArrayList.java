package Exercises.All_Coding_Exercises.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class q041_ReversingArrayList {
    public static void main(String[] args) {
        System.out.println("This is a program to reverse arraylist in Java.");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println("Original arrayList : "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("Reversed arrayList : "+arrayList);
    }
}
