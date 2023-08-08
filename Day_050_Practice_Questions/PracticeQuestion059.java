package Day_050_Practice_Questions;

// Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this monkey class and
// implements BasicAnimal interface with eat() and sleep() methods.
class Monkey {
    public void jump() {
        System.out.println("Jumping...");
    }

    public void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    public void eat();

    public void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human being is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Human being is sleeping...");
    }

    public void species() {
        System.out.println("Homo sapiens.");
    }
}

public class PracticeQuestion059 {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.sleep();
        human.bite();
        human.jump();
        human.species();

        // The output of the above code is :
        // Human being is eating...
        // Human being is sleeping...
        // Biting...
        // Jumping...
        // Homo sapiens.

        // Runtime polymorphism
        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();
        // monkey.eat();    -> This will give error.
        // monkey.sleep();  -> This will give error.
        // monkey.species();-> This will give error.

        // Basically in runtime polymorphism you can only access the methods of the parent class or the methods of the
        // parent class which are overridden in the derived class.
    }
}
