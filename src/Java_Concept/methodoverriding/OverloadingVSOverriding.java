package Java_Concept.methodoverriding;

class Base {
    void m1 (String str) {
        System.out.println(str);
    }

    void m2 (String s) {
        System.out.println(s);
    }
}

class SubClass extends Base {
    void m1 (String str) { // Overriding
        System.out.println(str + " Child class method");
    }

    void m2 (String s, int ages) { // Overloading
        System.out.println(s + " Ages Overloading " + ages);
    }
}

public class OverloadingVSOverriding {
    public static void main(String[] args) {
        SubClass obj = new SubClass();;
        obj.m1("Something News"); // Overriden method in child class
        obj.m2("Song"); // method from parent class
        obj.m2("Something news", 28); // Overloading in the child class
    }
}
