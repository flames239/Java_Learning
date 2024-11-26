package Java_Concept.thiskeyword;

public class UserDefine {
    // variables
    double x, y; // instance variables - mapped to obj memory

//    UserDefine(double a, double b) {
//        // a and b are Local Variables
//        x=a;
//        y=b;
//    }

    UserDefine(double x, double y) {
        // a and b are Local Variables
        this.x=x;
        this.y=y;
        // initilized variable values
    }

    // method
    void setData(double x, double y){
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        UserDefine tk = new UserDefine(100, 200);
        tk.setData(145.2,35.6);
        tk.display();
    }
}
