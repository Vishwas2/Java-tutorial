// Today we are going to learn about bit manipulation
// BITWISE OPERATORS :
// & (Binary AND)
// | (Binary OR)
// ^ (Binary XOR) (returns false if values are similar otherwise true)
// ~ (Binary One's complement)
// >> (Binary right shift)
// << (Binary left shift)

// LEFT SHIFT FORMAT :
// N<<i
// 2<<1 -> 010(converted to decimal)<<1 -> 100

// RIGHT SHIFT FORMAT :
// N>>i
// 2>>1 -> 010>>1 -> 001

// THERE ARE 4 TYPES OF OPERATIONS WE CAN PERFORM ON BITS WHICH ARE AS FOLLOWS :
// 1. Get bit -> used to know what bit(0 or 1) is present in a given position
// 2. Set bit -> changes 0 to 1 and 1 remains same
// 3. Clear bit -> changes 1 to 0 and 0 remains same
// 4. Update bit -> changes 1 to 0 and 0 to 1

// GET BIT :
// Q -> Get the 3rd bit(position = 2) of a number n. (n = 0101)
// Bit mask : 1<<i
// Operation : AND
/*
Step 1 : 1<<i -> 0001<<2 -> 0100
Step 2 : now we have to use the operator AND on 0100 and 0101 -> 0100
Step 3 : now since the number we got is not zero, therefor the bit at position 2 is 1.(position in bits starts from 0)
Step 4 : VERIFICATION : we always check bit from right to left so the 3rd bit is 1
 */

// SET BIT :
// Q -> Set the 2nd bit (position = 1) of a number n. (n = 0101)
// Bit mask : 1<<i
// Operation : OR
/*
Step 1 : 1<<i -> 0001<<1 -> 0010
Step 2 : now we have to use the operator OR on 0010 and 0101 -> 0111  // Note that the bit at position 1 has become 1.
 */

// CLEAR BIT :
// Q -> Clear the 3rd bit(position =2) of a number n.(n=0101)
// Bit mask : 1<<i
// Operation : AND with NOT of bitmask

// UPDATE BIT :
// Q -> Update the 2nd bit (position = 1) of a number n to 1.(n=0101)
// Bit mask : 1<<i
// For 0 : AND with NOT of bitmask , For 1 : OR
package Exercises.Day_095_Bit_Manipulation;

class BitManipulation {
    static int n = 5; // 0101
    static int pos = 2;


    static void getBit() {
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) { // NOTE : Here & (bitwise AND) is used
            System.out.println("bit is zero");
        } else {
            System.out.println("bit is one");
        }
    }


    static void setBit() {
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }

    static void clearBit() {
        int bitMask = 1 << pos;
        int newNumber = (n & (~bitMask));
        System.out.println(newNumber);
    }

    static void updateBit(int oper) {
        // oper =1 : set and oper= 0 : clear
        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}

public class Day095 {
    public static void main(String[] args) {
        BitManipulation bitManipulation = new BitManipulation();
        BitManipulation.getBit(); // OUTPUT : bit is one
        BitManipulation.setBit(); // OUTPUT : 5 (The number didn't change because the number at position 2 was 1 already)
        BitManipulation.clearBit(); // OUTPUT : 1
        BitManipulation.updateBit(0); // OUTPUT : 1
    }
}
