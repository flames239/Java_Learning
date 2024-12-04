package Java_Concept.oops;

// Multi level Inheritance

class DemoInheC {
    double c = 20.23d;
    void display() {
        System.out.println("Demo class InheC method display: " + c);
    }
}

class DemoInheD extends DemoInheC{
    //child 1
    int d = 10;
    void print1() {
        System.out.println("Demo class InheD extend InheC method print: " + d);
    }
}

class DemoInheE extends DemoInheD{
    //child 2
    int e = 10;
    void print2() {
        System.out.println("Demo class InheE extend InheD method print: " + e);
    }
}

public class Inheritance_MultiLevel {
    public static void main(String[] args) {
      /*  DemoInheD did = new DemoInheD();
        System.out.println(did.c);
        System.out.println(did.d);
        did.display();
        did.print();*/

        DemoInheE diE = new DemoInheE();
        diE.display();
        diE.print1();
        diE.print2();


    }
}
