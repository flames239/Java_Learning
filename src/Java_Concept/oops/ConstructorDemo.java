package Java_Concept.oops;

public class ConstructorDemo {
    int a,b;

    ConstructorDemo() { // default constructor
        a = 100;
        b = 200;
    }

    ConstructorDemo(int x, int y) { // parameterized constructor
        a = x;
        b = y;
    }

    void sum() {
        System.out.println(a+b);
    }

    void substract() {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        // default constructor
        ConstructorDemo csd = new ConstructorDemo();
        csd.substract();

        // parameterized constructors
        ConstructorDemo csd1 = new ConstructorDemo(2,4);
        csd1.substract();
    }
}
