package Java_Concept.looping_and_jumping;

public class While_vs_DoWhile {
    public static void main(String[] args) {

        // print 1 to 10
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        int f = 1; // check at least once before check condition true to loop
        do {
            System.out.println(f);
            f++;
        } while (f <= 10);
    }
}
