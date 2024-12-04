package Java_Concept.thiskeyword;

public class ThisKeyword {
    // variables
    double x, y; // instance variables - mapped to obj memory

//    ThisKeyword(double a, double b) {
//        // a and b are Local Variables
//        x=a;
//        y=b;
//    }

    ThisKeyword(double x, double y) {
        // x and y are Local Variables
        this.x=x;
        this.y=y;
    }



    // method
    void display() {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword(100, 200);
        tk.display();
    }
}
