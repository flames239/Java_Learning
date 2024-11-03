package Java_Concept.looping_and_jumping;

public class BreakContinue {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Loop is break and it will end
            }
            System.out.println(i);
        }
        System.out.println("End of for loop");

        for (int j = 1; j <= 10; j++) {
            if (j == 6 || j == 8) {
                continue; // the code below is skip
            }
            System.out.println(j);
        }
    }
}
