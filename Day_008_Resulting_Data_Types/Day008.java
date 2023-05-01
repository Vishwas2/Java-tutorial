public class Day008 {
    public static void main(String[] args) {
        /*
         * RESULTING DATATYPES AFTER ARITHMETIC OPERATIONS :
         * byte + short = int
         * short + int = int
         * long + float = float
         * integer + float = float
         * character + int = int
         * character + short = int
         * long + double = double
         * float + double = double
         */

        /*
         * INCREMENT AND DECREMENT OPERATOR :
         * a++ = first use the value of a and then increment it by 1
         * ++a = first increment the value of a by 1 and then use it
         * a-- = first use the value of a and then decrease it by 1
         * --a = first decrease the value of a by 1 and then use it
         */

        int i = 7;
        System.out.println(i++); // prints out 7
        System.out.println(i); // prints out 8
        System.out.println(++i); // prints out 9
    }
}
