package Day_069_Nested_Try_Catch_in_Java;

import java.util.Scanner;

public class Day069 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 5;
        marks[1] = 7;
        marks[2] = 8;
        Scanner scanner = new Scanner(System.in);
        // if you want the program to keep on running until a valid input is given by the user then you can use while loop like this :
        boolean flag =true;
        while(flag){
        System.out.println("Enter the value of the index : ");
        int input = scanner.nextInt();
        try {
            System.out.println("Welcome !");
            try { // nested try and catch
                System.out.println(marks[input]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist.");
                System.out.println("Exception in level 2 : " + e);
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1 : " + e);
        }}
        System.out.println("Thanks for using this program .");
    }
}
