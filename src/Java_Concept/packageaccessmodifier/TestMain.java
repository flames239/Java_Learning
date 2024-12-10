package Java_Concept.packageaccessmodifier;

import Java_Concept.accessmodifier.Test;

public class TestMain extends Test{
    public static void main(String[] args) {
        // Test t = new Test();
        /*
        default not working outside package
        t.b;
        t.display1("Nam");
        */

        TestMain obj = new TestMain(); // create child object to access int c and display2
        System.out.println(obj.c);
        obj.display2("protected use via inheritance and child class");

        Test obj1 = new Test();
        System.out.println(obj1.d);
        obj1.display3("access via different class and different package");

    }
}
