package Day_021_For_Each_Loop;

public class Day021 {
    public static void main(String[] args) {
        // array.length
        /*
         * Array have a length property which give the length of the array
         * for example we have an array marks then marks.length will give the length
         * of the array
         */

        // an array can be displayed using a for loop :
        /*
         * for(int i=0;i<marks.length;i++)
         * {
         * sout(marks[i]);
         * }
         */
        int[] marks = { 1, 2, 3, 4, 5 };
        float[] weight = { 23.5f, 45.8f, 78.9f };
        String[] name = { "Vishwas", "Adi", "Rahul", "Ajay" };
        System.out.println(marks[1]); // this will print out 2
        System.out.println(marks.length);// this will give 5 as output
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        // FOR - EACH LOOP
        // This is a better way of printing all of the elements of the array.
        /*
         * Array elements can also be traversed as follows :
         * for (int element : Arr){
         * sout(element); // prints all of the elements
         * }
         */
        for (String element : name) {
            System.out.println(element);
        }
    }
}
