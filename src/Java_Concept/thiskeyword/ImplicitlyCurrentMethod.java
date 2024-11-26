package Java_Concept.thiskeyword;

public class ImplicitlyCurrentMethod {
    //method
    void display1() {
        System.out.println("display1 method");
    }


    void display2() {
        // display1(); // this.display1() - its call implicitly
        this.display1();
        System.out.println("display2 method");
    }

    public static void main(String[] args) {
        ImplicitlyCurrentMethod icm = new ImplicitlyCurrentMethod();
        icm.display2();
    }
}
