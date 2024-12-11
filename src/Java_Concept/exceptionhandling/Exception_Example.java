package Java_Concept.exceptionhandling;

import java.util.Scanner;

public class Exception_Example {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        Scanner sc = new Scanner(System.in);

        /// Example 1: Arithmetric / 0
        /*
        System.out.println("Enter an Number: ");
        int num = sc.nextInt();
        System.out.println("Result: " + 1000/num); */

        /// Example 2 - ArrayOutOfBound
        /*int arr[] = new int[5];
        System.out.println("Enter a position(0-4): ");
        int position = sc.nextInt();

        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        arr[position] = value;
        System.out.println(arr[position]);*/

        /// Example 3
        /*String str = "12345";
        String str1 = "Abc";
        int num = Integer.parseInt(str1);
        System.out.println(str1);*/

        /// Example 4
        // String s = "Abc";
        // String s = ""; // empty
        String s = null;
        System.out.println(s.length());

        System.out.println("End of the program");


    }
}
