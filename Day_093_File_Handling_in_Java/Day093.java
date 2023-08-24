/*
FILE HANDLING IN JAVA
Reading from and writing to files is an important aspect of any programming language.
We can use the File class in Java to create a file object.
 */
// createNewFile() method -> creates a file
// Use .write() method of FileWriter to write to a file
// For reading files we can use the same scanner class and supply it a file object
// To delete a file object in Java, we can use the File object's delete() method.
package Day_093_File_Handling_in_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day093 {
    public static void main(String[] args) {
        // CODE TO CREATE A NEW FILE:
        // You can use createNewFile() method to create a new file, but you have to surround it in try-catch.
        File myFile = new File("note.txt");
        // Now you can use the createNewFile() method to actually create the above file, but you have to surround it in try-catch block.
        try {
            myFile.createNewFile(); // This will create a note.txt file
        } catch (IOException e) {
            System.out.println("Unable to create this file ."); // Print this message if unable to create a file.
            throw new RuntimeException(e);
        }

        // CODE TO WRITE TO A FILE:
        // You can use FileWriter() method to write to a file, but this also has to be surrounded in a try-catch block.
        try {
            FileWriter fileWriter = new FileWriter("note.txt");
            fileWriter.write("This is our first file from this Java course.\nHave a nice day."); // This will be written to the specified file.
            fileWriter.close(); // You also have to close a file after writing to it.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // CODE TO READ A FILE:
        //
        // Here we will use the same myFile object that we created earlier to avoid confusion.
        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // The output of the above code is:
        // This is our first file from this Java course.
        // Have a nice day.
        // This means that we are successfully able to read the note.txt file

        // CODE TO DELETE A FILE:
        if(myFile.delete()){
            System.out.println("I have deleted : "+myFile.getName());
        }
        else{
            System.out.println("Some error occurred while deleting the file.");
        }
    }
}
