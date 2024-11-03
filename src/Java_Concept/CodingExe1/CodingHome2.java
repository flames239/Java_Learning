package Java_Concept.CodingExe1;

public class CodingHome2 {
    public static void main(String[] args) {
        // reverse number
        int num = 12345;
        int remaider = 0;
        int reserve = 0;
        while (num > 0) {
            remaider = num % 10;
            reserve = reserve * 10 + remaider;
            num = num / 10;
        }
        System.out.println(reserve);
        System.out.println("-------------------------------------");

        int number = 12345;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}


