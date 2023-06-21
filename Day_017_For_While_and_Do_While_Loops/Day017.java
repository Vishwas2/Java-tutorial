package Day_017_For_While_and_Do_While_Loops;
// while, for and do while loop in Java

// Loops are used to execute a block of code repeatedly
// Loops can run infinitely
// There are different types of loops in java like :
// 1. While loop
// 2. For loop
// 3. Do While loop
// 4. Enhanced for loop (for - each loop)

// for example if you want to print out a list of numbers from 1 to 100 then loops are very useful

public class Day017 {
    public static void main(String[] args) {
        int i = 1;
        // USING WHILE LOOP
        while (i < 101) {
            System.out.println(i);
            i++; // this will print numbers from 1 to 100.
        }

        // USING FOR LOOP
        for (int j = 1; j < 101; j++) {
            System.out.println(j);
        }

        // USING DO WHILE LOOP
        int count = 1;
        do { // code is executed at least once
            System.out.println(count);
            count++;
        } while (count <= 100);

        // FOR EACH LOOP WILL BE DISCUSSED IN DETAIL IN LATER LECTURES
    }
}
// Different types of loops are suitable for different conditions
// Its up to your preference
// In Do While loop even if the condition is false, the loop body is executed at
// least once.