package Day_022_Multidimensional_Array;

public class Day022 {
    public static void main(String[] args) {
        // Multidimensional array are used if you want to put array inside an array
        // int[] marks; // a 1-D array
        int[][] flats; // a 2-D array
        flats = new int[2][3];// a 2-D array of 2 rows and 3 columns
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        // printing the flats array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}