// Create an ArrayList and store name of 10 students inside it. Print it using for-each loop.

package Day_087_Practice_Questions;

import java.util.ArrayList;

public class PracticeQuestion076 {
    public static void main(String[] args) {
        ArrayList<String> namesOfStudents= new ArrayList<>();
        namesOfStudents.add("Vishwas");
        namesOfStudents.add("Adi");
        namesOfStudents.add("Aditya");
        namesOfStudents.add("Shiven");
        namesOfStudents.add("Ashok");
        namesOfStudents.add("Arjun");
        namesOfStudents.add("Ram");
        namesOfStudents.add("Raghav");
        namesOfStudents.add("Aryan");
        namesOfStudents.add("Kartik");

        for(String element : namesOfStudents){ // printing the arraylist using for each loop
            System.out.println(element);
        }
        // The output of the above line of code is :
        // Vishwas
        //Adi
        //Aditya
        //Shiven
        //Ashok
        //Arjun
        //Ram
        //Raghav
        //Aryan
        //Kartik

        System.out.println(namesOfStudents); // printing the arraylist directly using System.out.println()
        // The output of the above line of code is :
        // [Vishwas, Adi, Aditya, Shiven, Ashok, Arjun, Ram, Raghav, Aryan, Kartik]
    }
}
