package Java_Concept.CodingExe1;

public class CodingHome8 {
    public static void main(String[] args) {
        // Swap 2 number without using third variable
        // solution 1
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b; // Step 1: a becomes 15 (in binary: a XOR b)
        b = a ^ b; // Step 2: b becomes 5 (in binary: (a XOR b) XOR b)
        a = a ^ b; // Step 3: a becomes 10 (in binary: (a XOR b) XOR a)

        System.out.println("After swapping: a = " + a + ", b = " + b);
        System.out.println("------------------------------------------");
        // solution 2
        int a1 = 5;
        int b1 = 10;

        System.out.println("Before swapping: a = " + a1 + ", b = " + b1);

        a1 = a1 + b1; // Step 1: a becomes 15
        b1 = a1 - b1; // Step 2: b becomes 5
        a1 = a1 - b1; // Step 3: a becomes 10

        System.out.println("After swapping: a = " + a1 + ", b = " + b1);
    }
}

