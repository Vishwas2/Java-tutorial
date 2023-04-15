public class Day002 {
    public static void main(String[] args) {
        /*
         * variables -> a variable is like a container which can store a value. The
         * value stored inside a variable can be changed.
         * data types -> data types are the different types of values that can be stored
         * inside a variable.
         */

        /*
         * there are two categories of data types in Java :
         * primitive data types
         * non-primitive data types
         */

        /*
         * Primitve Data types are a set of basic data types from which all other data
         * types are constructed. There are 8 primitive data types in Java :
         * boolen, byte, char, short, int, long, float and double.
         */

        /*
         * Keywords -> these are reserved words in Java that cannot be used as variable
         * name for example void, static etc.
         */

        /*
         * Rules for declaring a variable name :
         * Must not begin with a digit.
         * Name is case sensitive (Adi and adi are different)
         * Should not be a keyword (like void)
         * White space in not allowed.
         * Can contain alphabets, $ character, _ character and digits if other
         * conditions are met.
         */

        // 1 byte contains 8 bits

        // Java Program to Demonstrate Char Primitive Data Type
        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}