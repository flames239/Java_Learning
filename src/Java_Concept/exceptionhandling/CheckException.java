package Java_Concept.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckException {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("Start of the program");
        System.out.println("Statement 1");

        Thread.sleep(5000);
        FileInputStream file = new FileInputStream("C://Test.txt");

        System.out.println("End of the program");
    }
}
