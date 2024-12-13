package Java_Concept.superkeyword;

class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println("This is a dog.");
    }

    void show() {
        System.out.println("Name from superclass: " + super.name); // Accessing superclass variable
        super.display(); // Calling superclass method
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show(); // Output: Name from superclass: Animal
        //         This is an animal.
    }
}
