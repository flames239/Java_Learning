package Java_Concept.accessmodifier;

public class TestClass {
    public static void main(String[] args) {
        Test t = new Test();
        /*
        // private variable and method not in same class
        t.a;
        t.display();
        */

        System.out.println(t.b);
        t.display1("Display same package but different class");

        System.out.println(t.c);
        t.display2("Display same package but different class (protected)");

        System.out.println(t.d);

        t.display3("Display same package but different class (public)");
    }
}
