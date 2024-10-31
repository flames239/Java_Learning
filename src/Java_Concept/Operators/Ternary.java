package Java_Concept.Operators;

public class Ternary {
    // toán tử 3 ngôi
    // syntax: value = expression ? value 1 : value 2
    public static void main(String[] args) {

        boolean a,b;
        a = 10 > 5;
        b = 5 > 10;
        boolean result = !a ? true : false;
        System.out.println(result);


        int a1,b1;
        a1 = 10;
        b1 = 5;
        int result1 = a1 < b1 ? a1 : b1;
        System.out.println(result1);
    }
}
