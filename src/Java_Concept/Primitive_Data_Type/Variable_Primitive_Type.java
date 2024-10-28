package Java_Concept.Primitive_Data_Type;

public class Variable_Primitive_Type {
    /*
    * 2 data type
    * Primitive: reserved keywords
    * defined by the language
    * (Integers->[byte - 1 bytes]/[short - 2 bytes]/[int - 4 bytes]/[long - 8 bytes]
    * Decimal number -> [float - 4 bytes] default value: 0.0f/[double - 8 bytes] default value: 0.0d
    * Boolean -> [true/false - 1 bytes]
    * Character -> [char - 2 bytes] Example: 'a','^')
    *
    *
    *
    * Non - primitive: derived data types
    * Example: String, Java Collections - ArrayList, HashSet, HashMap
    * */
    public static void main(String[] args) {

        int delecration; // declare variable not assign value
        delecration = 250; // assign the value to varible
        System.out.println(delecration);


        byte byte_varible = 127; // store value from -128 to 127
        System.out.println(byte_varible);

        short short_variable = 4352;
        System.out.println(short_variable);

        int int_variable = 156468461;
        System.out.println(int_variable);

        long long_variable = 6846854887658L; // when input large number, input L in the end of the value
        System.out.println(long_variable);


        /*
        * float
        * double
        * */

        float product_price; // consume 4 bytes
        double total; // consume 8 bytes

        product_price = 15.4545454444445F;
        total = 72.4;

        System.out.println("float-value is: " + product_price);
        System.out.println("double-value is: " + total);

        // char - consume 2 bytes
        char char_variable = 'p';


    }

}
