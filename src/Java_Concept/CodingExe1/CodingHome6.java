package Java_Concept.CodingExe1;

public class CodingHome6 {
    public static void main(String[] args) {
        // Factorial of number -- 5 : 5*4*3*2*1 Giai thừa
        int num = 6;
        int factorial = 1; // declare with number 1
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
