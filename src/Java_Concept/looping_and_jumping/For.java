package Java_Concept.looping_and_jumping;

public class For {
    public static void main(String[] args) {
        for (int khoidau = 1; khoidau <= 10; khoidau++) {
            System.out.println("khoi dau la " + khoidau);
        }

        // odd number
        for (int khoidau1 = 1; khoidau1 <= 10; khoidau1+=2) {
            System.out.println("khoi dau 1 la " + khoidau1);
        }

        // even number
        for (int khoidau2 = 2; khoidau2 <= 10; khoidau2+=2) {
            System.out.println("khoi dau 2 la " + khoidau2);
        }

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 1){
                System.out.println("Odd is " + i);
            } else {
                System.out.println("Even is " + i);
            }
        }
    }
}
