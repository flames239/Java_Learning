package Java_Concept.Operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a, b, c1, d1;
        a = 10;
        b = 5;
        c1 = 100;
        d1 = 9;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = c1 % d1;

        System.out.println("10 + 5 = " + c);
        System.out.println("10 - 5 = " + d);
        System.out.println("10 * 5 = " + e);
        System.out.println("10 / 5 = " + f);
        System.out.println("100 % " + d1 + " = "   + g);// remainder of a division operation -> phan du cua phep chia
    }
}
