package Java_Concept.oops;

public class Addition_Polymorphishm {
    int a,b;

    void sum() { // no input
        a = 1;
        b = 2;

        System.out.println(a+b);
    }

    void sum(int x, int y) { // two inputs
        System.out.println(x + y);
    }

    void sum(int x, double y) { // two inputs - different datatypes
        System.out.println(x + y);
    }

    void sum(double x, int y) { // two inputs - order of data types is changed
        System.out.println(x + y);
    }


    void sum(int x, int y, int z) { // two inputs - order of data types is changed
        System.out.println(x + y + z);
    }
}
