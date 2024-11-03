package Java_Concept.CodingExe1;

public class CodingHome1 {
    public static void main(String[] args) {
        int a, b;
        a = 20;
        b = 40;

        if(a > b) {
            System.out.println(a + " is the largest value");
        } else {
            System.out.println(b + " is the largest value");
        }

        System.out.println("----------------------------------------");
        // ternary operator
        int x,y;
        x = 100; y = 200;
        boolean result = x > y ? true : false;
        System.out.println(result);

        System.out.println("----------------------------------------");

        int age = 25;
        if(age > 18) {
            System.out.println("is eligible for voting");
        } else {
            System.out.println("is ineligible for voting");
        }

        System.out.println("----------------------------------------");
        int bmi = 23;
        if(bmi < 20) {
            System.out.println("underweight");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("over weight");
        } else {
            System.out.println("Obesity");
        }
    }
}
