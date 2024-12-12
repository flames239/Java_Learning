package Java_Concept.oops;

interface Note {
     int numOfPages = 190; // final static
     String designer = "Nam";

    void method1(); /// abstract method

    default void method2() {
        System.out.println("Default method");
    }

    static void method3() {
        System.out.println("Static method");
    }
}

public class InterfaceDemo implements Note {

    public void method1() {
        System.out.println("Abstract method code");
    }

    public void method4(String str) {
        System.out.println("Method 4: " + str);
    }

    public static void main(String[] args) {
        // Case 1
        InterfaceDemo id = new InterfaceDemo();
        /// Abstract method
        id.method1();

        /// Default method
        id.method2();

        /// Use interface, can call static method in Interface
        Note.method3();

        /// call interface method
        id.method4("");

        /*
        * Case 2
        * Using Interface reference to call ChildClass Object
        * */
        // Child class object with Interface reference variable
        Note n = new InterfaceDemo();
        n.method1();
        n.method2();
        Note.method3();
        /// not possible to call Interface child class method with Interface
        // n.method4();
    }


}
