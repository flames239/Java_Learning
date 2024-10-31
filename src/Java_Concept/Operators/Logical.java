package Java_Concept.Operators;

public class Logical {

    public static void main(String[] args) {
        boolean a,b;

        a = 10 > 5;
        b = 5 > 10;
        boolean c = a && b;
        boolean d = a || b;
        boolean e = !a;
        boolean f = !b;
        System.out.println("logical && is " + c);
        System.out.println("logical || is " + d);
        System.out.println("logical ! is " + e);
        System.out.println("logical ! is " + f);

    }



}
