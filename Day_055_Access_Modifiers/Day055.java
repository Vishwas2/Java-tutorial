package Day_055_Access_Modifiers;

    // Access modifiers determine whether other classes can use a particular field or invoke a particular method. They can be
    // public, private, protected or default(no modifiers)
    /*
                 ACCESS LEVELS
    MODIFIER    CLASS    PACKAGE    SUBCLASS    WORLD
    public      y        y          y           y
    protected   y        y          y           n
    default     y        y          n           n
    private     y        n          n           n
     */

/* Public :
* The public access modifier is specified using the keyword public.
* The public access modifier has the widest scope among all other access modifiers.
* Classes, methods or data members which are declared as public are accessible from everywhere in the program .There is
  no restriction on the scope of public data members.
 */

/* Protected :
* The protected access modifier is specified using the keyword protected.
* The methods or data members declared as protected are accessible within same package or subclasses in different packages.
* Classes cannot be declared protected.
 */

/* Default :
* When no access modifier is specified for a class, method or data members - it is said to be having the default access
  modifier by default.
* The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier
  are accessible only within the same package.
 */

/* Private :
* Private access modifiers are specified using the keyword private.
* The method or data members declared as private are accessible only within the class in which they are declared.
* Any other class of the same package will not be able to access these members.
* Classes or interfaces cannot be declared as private.
 */

    class Sample { // Default class
        public int x = 5;
        protected int y = 45;
        int z = 6;
        private int a = 78;

        public void method1() { // method1 will be able to access the values of all the variables x,y,z and a since it's in the same class.
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(a);
        }
    }
public class Day055 {
    public static void main(String[] args) {
        Sample sample = new Sample();

        // TESTING FOR THE SAME CLASS :
        sample.method1(); // This will be able to print out values of all the 4 variables.

        // TESTING FOR THE SAME PACKAGE :
        System.out.println(sample.x);
        System.out.println(sample.y);
        System.out.println(sample.z);
//        System.out.println(sample.a); -> This will give an error (you cannot access private modifier in the same package)
    }
}
