// There are 4 types of accesss modifiers in Java :
// 1. Private -> to make a class member private (can only be accessed within the same class) (use getters and setters)
// 2. Default
// 3. Protected
// 4. Public

package Day_033_Access_Modifiers_Getters_and_Setters;

public class Day033 {
    static class myEmployee {
        private int id;
        private String name;

        public void setName(String n) {
            name = n;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setId(int n) {
            id = n;
        }
    }

    public static void main(String[] args) {
        myEmployee vishwas = new myEmployee();
        vishwas.setName("Vishwas Rana"); // using setter to set the name
        System.out.println(vishwas.getName()); // printing out getter
        vishwas.setId(45);
        System.out.println(vishwas.getId());
        // the advantage of using getter and setter is that you can add validations for example if the name contains
        // numbers then it is not a valid name, or phone number cannot contain a special character
    }
}
