package Java_Concept.thiskeyword;

public class ConstructorChaning {
    ConstructorChaning() {
        System.out.println("Default Constructors");
    }

    ConstructorChaning(String str) {
        this(); // call first constructor
        System.out.println(str);
    }

    ConstructorChaning(String str, int x) {
        this("Name"); // // call second constructor
        System.out.println(str + " " + x);
    }

    public static void main(String[] args) {
        /*
        * Call this() in each constructor -> it's call chain constructor
        * */

        // ConstructorChaning ct = new ConstructorChaning();
        // ConstructorChaning ct1 = new ConstructorChaning("String New");
        ConstructorChaning ct2 = new ConstructorChaning("String New",239);
    }
}
