package Day_023_Practice_Question;
// Create a Java program to add two matrices of size 2X3

public class PracticeQuestion32 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[2][3];
        // putting elements in matrix 1
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[0][2] = 3;
        matrix1[1][0] = 4;
        matrix1[1][1] = 5;
        matrix1[1][2] = 6;
        // putting elements in matrix 2
        matrix2[0][0] = 7;
        matrix2[0][1] = 8;
        matrix2[0][2] = 9;
        matrix2[1][0] = 10;
        matrix2[1][1] = 11;
        matrix2[1][2] = 12;
        System.out.println("The matrix 1 is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("The matrix 2 is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("The sum of the two matrices is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
