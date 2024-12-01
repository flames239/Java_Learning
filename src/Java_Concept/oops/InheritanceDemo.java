package Java_Concept.oops;

// Single Inheritance

class DemoInheA {
    double a = 20.23d;
    void display() {
        System.out.println("Demo class InheA method display: " + a);
    }
}

class DemoInheB extends DemoInheA{
    int b = 10;
    void print() {
        System.out.println("Demo class InheB method print: " + b);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        DemoInheA dia = new DemoInheA(); // object creation class A
        System.out.println(dia.a);
        dia.display();

        DemoInheB dib = new DemoInheB();
        System.out.println(dib.a); // class DemoInheA
        System.out.println(dib.b); // class DemoInheB
        dib.display();
        dib.print();
    }
}
