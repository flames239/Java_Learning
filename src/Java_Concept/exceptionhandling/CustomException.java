package Java_Concept.exceptionhandling;

public class CustomException {
    public static void main(String[] args) throws TestException {
        throw new TestException("Test");
    }
}
