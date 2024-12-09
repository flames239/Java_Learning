package Java_Concept.wrapper;

public class WrapperDataType {
    public static void main(String[] args) {
        int a = 10;
        Integer i = 100;

        double d = 20.92D;
        Double dou = 201.4;

        // Case: convert string to other data types
        // String str = "abc";
        String str = "12345";
        int x = Integer.parseInt(str);
        System.out.println("Data wrap from string to int data type: " + x);

        String str1 = "54.15";
        double doub = Double.parseDouble(str1);
        System.out.println("Data wrap from string to double data type: " + doub);


    }
}
