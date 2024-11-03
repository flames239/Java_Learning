package Java_Concept.looping_and_jumping;

public class Comparision_For_While_DoWhile {
    public static void main(String[] args) {
        /*
        * For loop is prefer when we know the condition
        * Code should execute at least once before check the condition (do-while)
        * condition is uncertain - loop terminate - break; (while)
        *
        * */

        int i = 1;
        while(true) {
            System.out.println(i);
            if(i == 5) {
                break; // jumping statement
            }
            i++;
        }
    }
}
