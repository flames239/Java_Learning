package Java_Concept.CodingExe1;

public class CodingHome9 {
    public static void main(String[] args) {
        /* Printing Number Pattern
        int num = 5;
        for(int i = 1; i <= num ; i++) { // print row
            for(int j = 1; j <= i; j++){ // print column
                System.out.print(j);
            }
            System.out.println();
        }
        1             11111
        12            22222
        123           33333
        1234          44444
        12345         55555
        */

        int num = 5;
        for (int i = 1; i <= num; i++) { // print row
            for (int j = 1; j <= i; j++) { // print column
                if(i % 2 == 0) { // even number -  it exe only once
                    System.out.print(i);
                    break;
                }
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
