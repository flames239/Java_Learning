package Java_Concept.CodingExe1;

public class CodingHome4 {
    public static void main(String[] args) {
        // Count number of digit 123456
        // output : 6
        int num = 1234562423;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println("Count : " + count);

    }
}
