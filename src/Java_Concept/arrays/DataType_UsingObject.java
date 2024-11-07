package Java_Concept.arrays;

public class DataType_UsingObject {
    public static void main(String[] args) {

        // Class Object can using different data type
        Object obj[] = {12, 5.9, "Welcome to Java Home", false};

        for(Object x : obj) {
            System.out.println(x);
        }
    }
}
