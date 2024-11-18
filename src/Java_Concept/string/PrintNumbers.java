package Java_Concept.string;

public class PrintNumbers {
    public static void main(String[] args) {
        // print numbers 1 to 100 with not using any numbers in program

        // approach 1
        int one = 'A'/'A'; // -> 'A' decimal is 65
        String str = "nnnnnnnnnn";
        int len = str.length();

        for (int i = one; i <= len * len; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");

        // approach 2
        for (int i = one; i <= 'd'; i++) { // 'd' decimal is 100
            System.out.println(i);
        }
    }
}
