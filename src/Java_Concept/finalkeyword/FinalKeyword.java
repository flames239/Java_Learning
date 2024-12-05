package Java_Concept.finalkeyword;

class TestClass {
    final String name = "Nam";

    void display() {
       System.out.println("Parent Display method");
    }

    final void displayParent() {
        System.out.println("Parent final method Display method");
    }
}

class Child extends TestClass {
    void display() { // Override
        System.out.println("Child Display method");
    }

    /// final can't override method when input final in parents method
//    void displayParent() {
//        System.out.println("Child Display method Override FINAL");
//    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
       // System.out.println(obj.name);
       // obj.name = "Ha"; // compile throw an error
       // System.out.println(obj.name);

        Child obj1 = new Child();
        obj1.display();
    }
}
