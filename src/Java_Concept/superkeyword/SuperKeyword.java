package Java_Concept.superkeyword;

class Car {
    int speed = 100;;

    Car() {
        super();
        System.out.println("Car default constructor - Parent Class");
    }
    void accelerate() {
        System.out.println("Accelerate in Parent class");
    }
}

class BMW extends Car {
    int speed = 150;

    BMW() {
        super();
//        System.out.println("BWM default constructor");
    }

    void displaySpeed() {
        // child class variable
        System.out.println("Speed of BMW when not using super keyword: " + speed);

        // immediate parent class variable
        System.out.println("Speed of BMW when using super keyword: " + super.speed);
    }

    void accelerate() {
        System.out.println("Accelerate in Child class");

        // call method in parent class immediate when using super
        super.accelerate();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        BMW bmw = new BMW();
//        bmw.displaySpeed();
//        bmw.accelerate();
    }
}
