package Java_Concept.statickeyword;

public class MyClass {

    static int count;

    int instance;

    MyClass() {
        count = 0;
        instance = 0;
        count++;
        instance++;
    }

    static void displayCounter() {
        count++;
        System.out.println(count);
        int c = count; // can call directly
        System.out.println("variable static call in static method: " + count);
        // int d = instance; non-static can't call directly to static

        int c123 = MyClass.count;

    }

    void displayInstance() {
        instance++;
        System.out.println(instance);
        int c1 = count;
        System.out.println("variable static call in non-static method: " + c1);

        int d1 = instance;
        System.out.println("non-static variable call in non-static method: " + d1);

        MyClass mc11 = new MyClass();
        int inst = mc11.instance;
        System.out.println("Create Object and assign variables in non-static variable in same class: " + inst);
        /*
        Object can access in non-static variables and non-static methods
        */


    }

    public static void main(String[] args) {
        MyClass.displayCounter();

        MyClass mc = new MyClass();
        mc.displayInstance();

//        MyClass mc1 = new MyClass();
//        mc1.displayCounter();
//
//        MyClass mc2 = new MyClass();
//        int x = mc2.instance;
//        mc2.displayCounter();
    }
}
