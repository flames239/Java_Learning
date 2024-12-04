package Java_Concept.methodoverriding;

class ParentClass {
    void display() {
        System.out.println("Parent display method");
    }
}

class ChildClass extends ParentClass {
    @Override
    void display() { // Overring
        System.out.println("Child display method");
    }
}

public class OverRidingAnnotation {
    public static void main(String[] args) {
         ChildClass obj = new ChildClass();
         obj.display();
    }
}
