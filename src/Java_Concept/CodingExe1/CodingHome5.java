package Java_Concept.CodingExe1;

public class CodingHome5 {
    public static void main(String[] args) {
        // fibonanci
        int n = 10; // Number of terms
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
