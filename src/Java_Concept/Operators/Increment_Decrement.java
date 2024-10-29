package Java_Concept.Operators;

public class Increment_Decrement {
    public static void main(String[] args) {
        double a = 10.5;
        a++;  //a = a + 1; // a+=1;
        System.out.println("a++ = " + a);

        double b = 10.5;
        double result = b++; // Post increment operation (value assign to the result and then as value get changed)
        System.out.println("b++ = " + b);
        System.out.println("result = " + result);

        double c = 10.5;
        double result1 = ++c; // Pre increment operation (value is increments first then get assigned to the result)
        System.out.println("c++ = " + c);
        System.out.println("result1 = " + result1);

        double a1 = 10.5;
        a1--;  //a = a + 1; // a+=1;
        System.out.println("a1-- = " + a1);

        double a2 = 10.5;
        double result2 = a2--; // Post decrement operation (value assign to the result and then as value get changed)
        System.out.println("a2-- = " + a2);
        System.out.println("result2 = " + result2);

        double a3 = 10.5;
        double result3 = --c; // Pre decrement operation (value is increments first then get assigned to the result)
        System.out.println("--a3 = " + a3);
        System.out.println("result3 = " + result3);



    }
}
