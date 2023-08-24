package Day_092_Java_Generics;

import java.util.ArrayList;

// CONSIDER THE FOLLOWING EXAMPLE:
// lets make a simple class StringPrinter that set string to something and print it out.
class StringPrinter{
    String thingToPrint;
    public StringPrinter(String thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
// now suppose we want to do the same thing but with integer or float or double, then we have to make another class for them
// which will do the exact same thing as the above class but will take integer or float etc.
// We would end up with a lot of code duplication.
// THIS IS WHERE GENERICS COME IN. THEY OFFER YOU THE ABILITY TO HAVE ONE CLASS LIKE THIS THAT IS FLEXIBLE FOR MANY DIFFERENT TYPES

class Printer <T> /* Here T is the type parameter*/{
    // T represents the type of thing that this printer is going to be able to hold and print.
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
    // Now this class is a generic printer for whatever type we want.
}
public class Day092 {

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(23); // This tells java that you want a printer for integers
        integerPrinter.print();
        Printer<String> stringPrinter = new Printer<>("Hello World");
        stringPrinter.print();
        // The output of the above code is :
        // 23
        // Hello World

        // With the help of generics, we don't have to make extra classes with the same logic.
        // You might have noticed that we also use generics with arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
//        arrayList.add("Hello"); -> This will give an error.

    }
}