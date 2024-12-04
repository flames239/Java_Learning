package Java_Concept.oops;

class parent1 {

}

class parent2 {
}

class child // (extends parent1, parent2) [not support for Java class]
{
    void display() {
        System.out.println("Welcome");
    }

    void display1() {
        System.out.println("Welcome 1");
    }
}


public class Multiple_Inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();  // object is the superclass, it inherited all method
        c.display1();
    }
}
