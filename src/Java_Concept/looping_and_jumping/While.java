package Java_Concept.looping_and_jumping;

public class While {
    public static void main(String[] args) {
        /*
        * syntax:
        * init variable
        * while(condition) { condition return true/false
        * statement
        * increment / decrement
        * }
        *
        * */
       /* int khoidau = 1;
        while(khoidau <= 10) {
            System.out.println(khoidau);
            khoidau++;
        } */

//        int odd = 1;
//        while (odd <= 10) {
//            if(odd % 2 == 1) {
//                System.out.println("Odd number is: " + odd);
//            }
//            odd++;
//        }
//
//        int even = 1;
//        while (even <= 10) {
//            if(even % 2 == 0) {
//                System.out.println("Even number is: " + even);
//            }
//            even++;
//        }

//        int even_odd = 1;
//        while (even_odd <= 10) {
//            if(even_odd % 2 == 0 || even_odd % 2 == 1 ) {
//                System.out.println("OddEven number is: " + even_odd);
//            }
//            even_odd++;
//        }

        int odd_plus = 1;
        while (odd_plus <= 10) {
            System.out.println("Odd plus is: " + odd_plus);
            odd_plus += 2;
        }

        int even_plus = 2;
        while (even_plus <= 10) {
            System.out.println("Even_plus is: " + even_plus);
            even_plus += 2;
        }

        int ten = 10;
        while (ten >= 1) {
            System.out.println("Reverse number is: " +  ten);
            ten--;
        }

    }
}
