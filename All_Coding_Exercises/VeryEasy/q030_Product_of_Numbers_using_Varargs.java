package VeryEasy;

public class q030_Product_of_Numbers_using_Varargs {
    static void product(int... arr) {
        int product = 1;
        for (int element : arr) {
            product = product * element;
        }
        System.out.println("The product of the numbers is : " + product);
    }

    public static void main(String[] args) {
        System.out.println("This is a program to print out the product of numbers using varargs.");
        product(10, 2, 3); // 60
    }
}
