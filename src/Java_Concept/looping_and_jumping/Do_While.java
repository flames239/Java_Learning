package Java_Concept.looping_and_jumping;

public class Do_While {
    /*
    * Syntax:
    * Init variable
    * do {
    * statement
    * increment / decrement
    * } while (condition)
    * */
    public static void main(String[] args) {
        int incre = 1;
        do {
            System.out.println("print incre: " + incre);
            incre++;
        }while (incre <= 10);

        int decre = 10;
        do {
            System.out.println("print decre: " + decre);
            decre--;
        }while (decre >= 1);
    }
}
