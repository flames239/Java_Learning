package Java_Concept.thiskeyword;

public class ConstructorThis {

    ConstructorThis() {
        System.out.println("Default Constructors");
    }

    ConstructorThis(String str) {
       //this(); // it will call a default constructors
        System.out.println(str);
    }

    ConstructorThis(String str, int x) {
        this("Name"); // it will call a constructors with parameterized
        System.out.println(str + " " + x);
    }

    public static void main(String[] args) {
        // ConstructorThis ct = new ConstructorThis();
        // ConstructorThis ct1 = new ConstructorThis("String New");
        ConstructorThis ct2 = new ConstructorThis("String New",239);
    }
}
