package Java_Concept.oops;

// Hierarchy_Inheritance

class DemoInheF { //Parent
    double f = 20.23d;
    void display() {
        System.out.println("Demo class InheF method display: " + f);
    }
}

class DemoInheG extends DemoInheF {
    //child 1
    int g = 10;
    void print1() {
        System.out.println("Demo class InheG extend from parent InheF method print: " + g);
    }
}

class DemoInheK extends DemoInheF {
    //child 2
    int k = 10;
    void print2() {
        System.out.println("Demo class InheK extend from parent InheF method print: " + k);
    }
}

public class Hierarchy_Inheritance {
    public static void main(String[] args) {
        DemoInheG dig = new DemoInheG();
        System.out.println(dig.f); // parent
        dig.display();

        System.out.println(dig.f); // parent
        dig.display();
        System.out.println(dig.g); // child one
        dig.print1();

        DemoInheK dik = new DemoInheK();
        System.out.println(dik.f); // parent
        dik.display();
        System.out.println(dik.k); // child two
        dik.print2();
    }
}
