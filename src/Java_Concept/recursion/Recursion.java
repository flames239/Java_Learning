package Java_Concept.recursion;

public class Recursion {

    // Recursion is an algorithm
    // 1 - method call itself - infinite loop
    // 2 - condition - will used to break the loop
    public static void printNumbers(int n) {
        if (n < 1)
            return;
        printNumbers(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }


}
