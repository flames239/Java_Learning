package Java_Concept.Conditional_Statements;

public class Switch_Case {
    public static void main(String[] args) {
        /*
        * syxtax
        * switch(variable) can be any data type {
        *   case 1 ... n:
        *   statement
        *   break;
        *   default:
        *   statement
        * }
        * */

        int day = 4;
        switch (day) {
            case 1:
                    System.out.println("Monday");
                    break;

            case 2:

                    System.out.println("Tuesday");
                    break;

            case 3:

                    System.out.println("Wednesday");
                    break;

            case 4:

                    System.out.println("Thrusday");
                    break;

            case 5:

                    System.out.println("Friday");
                    break;

            case 6:

                    System.out.println("Saturday");
                    break;

            case 7:

                    System.out.println("Sunday");
                    break;

            default:
                System.out.println("Month recently");
        }
    }
}
