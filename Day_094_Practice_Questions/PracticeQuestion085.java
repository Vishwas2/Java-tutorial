package Day_094_Practice_Questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticeQuestion085 {
    static String generateMultiplicationTable(int num) {
        StringBuilder table = new StringBuilder();
        table.append("The multiplication table of ").append(num).append(" is :\n");
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            table.append(i).append(" X ").append(num).append(" = ").append(result).append("\n");
        }
        return table.toString();
    }

    public static void main(String[] args) {
        System.out.println("This is a program to generate the multiplication table of a number and write it to a file.");
        System.out.println("Enter the number whose table you want to print out:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close(); // Close the scanner to prevent resource leak

        String tableContent = generateMultiplicationTable(number);

        System.out.println(tableContent); // Print the table to the console

        File file = new File("table.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(tableContent);
            System.out.println("Table written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
