package Day_034_Constructors;

public class Day034 {
    static class myMainEmployee {
        private int id;
        private String name;

        // To make a constructor you have to write the same name of the class as method
        // You can also do method overloading in constructors
        public myMainEmployee(String myName) { // You can also pass arguments to constructors (like String myName)
            id = 45; // id is set to 45 , without using setter
            name = myName;
        }

        // Doing method overloading :
        public myMainEmployee(String myName, int myId) {
            id = myId;
            name = myName;
        }

        public myMainEmployee() {
            id = 5;
            name = "Vishwas Rana";
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        // creating setters and getters for each and every attribute of the class would be very
        // tedious that's why we use constructors
        // CONSTRUCTORS -> A member function used to initialize an object while creating it
        // You can also do method overloading in constructors
        myMainEmployee vishwas = new myMainEmployee("Vishwas Rana", 7);
        System.out.println(vishwas.getId());
        System.out.println(vishwas.getName());
        // The given code will execute without giving any error
    }
}
