package Java_Concept.Operators;

public class Relational {
    public static void main(String[] args) {
        int a, b;
        boolean c,d,e,f,g,h;
        a = 10;
        b = 5;

        c = a > b;
        d = a < b;
        e = a == b;
        f = a != b;
        g = a >= b;
        h = a <= b;

        System.out.println("10 > 5: " + c);
        System.out.println("10 < 5: " + d);
        System.out.println("10 == 5: " + e);
        System.out.println("10 != 5: " + f);
        System.out.println("10 >= 5: " + g);
        System.out.println("10 <= 5: " + h);
    }
}
