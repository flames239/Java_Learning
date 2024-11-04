package Java_Concept.CodingExe1;

public class CodingHome10 {
    public static void main(String[] args) {
        // printing star pattern
       /* int num = 9;
        for(int i = 1; i <= num ; i++) { // print row
            for(int j = 1; j <= i; j++){ // print column
                System.out.print("*");
            }
            System.out.println();

            Output:
            *
            **
            ***
            ****
            *****
            ******
    }  */
      /*  int num = 5;
        for (int i = 1; i <= num; i++) { // print row
            for (int j = num; j >= i; j--) { // print column reverse
                System.out.print("*");
            }
            System.out.println();

            Output:
            *****
            ****
            ***
            **
            *
        }*/

        int num = 5;
        for (int i = 1; i <= num; i++) { // print row
            for (int j = 1; j <= i; j++) { // print column
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) { // print row
            for (int j = num; j > i; j--) { // print column reverse
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        * Output:
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
       */
    }
}
