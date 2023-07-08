package Day_031_Creating_Our_Own_Class;

class Employee {
    int id; // Attribute 1
    String name; // Attribute 2
    int salary; // Attribute 3

    // Defining a method printDetails() inside the custom class Employee
    public void printDetails() {
        System.out.println("The id is : " + id);
        System.out.println("The name is : " + name);
        System.out.println("The salary is : " + salary);
    }

    // Defining another method getSalary()
    public int getSalary() {
        return salary;
    }
    // You can create as many methods as you want inside the custom class
}

public class Day031 {
    public static void main(String[] args) {
        Employee vishwas = new Employee(); // Instantiating a new Employee object
        Employee adi = new Employee();
        // Setting Attributes for adi :
        adi.id = 2;
        adi.name = "Adi Seth";
        adi.salary = 800000;

        // Setting Attributes for vishwas :
        vishwas.id = 1;
        vishwas.name = "Vishwas Rana";
        vishwas.salary = 5000000;

        vishwas.printDetails();
        adi.printDetails();
        int salary = adi.getSalary();
        System.out.println(salary);
        // System.out.println(vishwas.name);
        // Any real world Object = Properties + Behaviour
        // Object in OOPs = Attributes + Methods
    }
}