package Day_032_Practice_Questions;

// Create a class Employee with the following properties and methods :
/*Salary (property)(int)
 * getSalary (method returning salary)
 * name (property)(string)
 * getName (method returning string)
 * setName (method changing name) */
public class PracticeQuestion44 {
    static class Employee {
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String a) {
            name = a;
        }
    }

    public static void main(String[] args) {
        Employee vishwas = new Employee();
        // Setting attributes
        vishwas.name = "Vishwas Rana";
        vishwas.salary = 100;
        // Printing out the name and salary :
        System.out.println(vishwas.getName());
        System.out.println(vishwas.getSalary());
        // Using setName to change the name to KING RANA :
        vishwas.setName("KING RANA");
        // Printing out the name again to check whether it is actually changed or not
        System.out.println(vishwas.getName());
    }
}
