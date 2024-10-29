package Java_Concept.Operators;

public class Assignment {
    // toán tử gán
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 20; // update the value
        System.out.println(a);
        a = 30;
        System.out.println(a);

        // +=
        int b = 10;
        b += 1;
        System.out.println("b+= is " + b);

        // -=
        int c = 10;
        c -= 1;
        System.out.println("c-= is " + c);

        // *=
        int d = 10;
        d *= 4;
        System.out.println("d*= is " + d);

        // /=
        int e = 10;
        e /= 2;
        System.out.println("e/= is " + e);

        // %=
        int f = 10;
        f %= 3;
        System.out.println("f%= is " + f);
    }
}
