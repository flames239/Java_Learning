package Java_Concept.exceptionhandling;

import java.util.Scanner;

public class Exception_Example1 {
    public static void main(String[] args) {
        /// case 1:
 /*       try {
            System.out.println("Start of the program");
            Scanner sc = new Scanner(System.in);

            /// Example 1:
            System.out.println("Enter an Number: ");
            int num = sc.nextInt();
            System.out.println("Result: " + 1000 / num);

            sc.close();
            System.out.println("End of the program");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block statement");
        }
*/
        /// case 2
        try {
            System.out.println("Start of the program");
            Scanner sc = new Scanner(System.in);

            /// Example 1:
            System.out.println("Enter an Number: ");
            int num = sc.nextInt();
            System.out.println("Result: " + 1000 / num);

            sc.close();
            System.out.println("End of the program");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block statement");
        }
    }
}
