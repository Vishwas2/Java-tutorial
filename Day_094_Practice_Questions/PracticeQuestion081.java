// Write a program to print out the multiplication table of a number and write it to a file
package Day_094_Practice_Questions;

import java.io.FileWriter;
import java.io.IOException;

public class PracticeQuestion081 {
    public static void main(String[] args) {
        int i =5;
        String multiplicationTable ="";
        for (int j=1;j<=10;j++){
            multiplicationTable += i+"X"+j+"="+(i*j);
            multiplicationTable += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(multiplicationTable);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
