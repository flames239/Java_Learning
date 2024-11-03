package Java_Concept.CodingExe1;

public class CodingHome3 {
    public static void main(String[] args) {
        // Palindrome number: read backward
        int num = 12345;
        int temp = num;

        int remaider = 0;
        int reserve = 0;
        while (num > 0) {
            remaider = num % 10;
            reserve = reserve * 10 + remaider;
            num = num / 10;
        }
        System.out.println(reserve);
        if (temp == reserve) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}


