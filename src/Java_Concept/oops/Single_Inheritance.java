package Java_Concept.oops;

class Base {
    int x = 1;
    int y = 2;
    void display() {
        System.out.println("Print method in parent class");
    }
}

class SubClass extends Base {
    int a = 3;
    int b = 4;
    void print() {
        System.out.println("Print method in child class");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        SubClass sc = new SubClass(); /// child class object reaction
        int var1 = sc.x; /// parent class variables
        System.out.println(var1);
        int var2 = sc.x; /// parent class variables
        System.out.println(var2);
        sc.display(); /// parent class method

        int var3 = sc.a; /// child class variables
        System.out.println(var3);
        int var4 = sc.b; /// child class variables
        System.out.println(var4);
        sc.print(); /// child class method
    }
}
