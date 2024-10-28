package Java_Concept.Primitive_Data_Type;

public class Variable {
    public static void main(String[] args) {
        /*
        2 type data
        Primitive - reversed keyword
        byte - 1 byte
        short - 2 byte
        int - 4 byte
        long - 8 byte

        float - 4 byte
        double - 8 byte

        char - 2 byte
        boolean - 1 byte

        Non-Primitive - Devired Data Type
        String, ArrayList, HashSet, HashMap
        * */

        byte byte_variable; // consume 1 bytes
        short short_variable; // consume 2 bytes
        int int_variable; // consume 4 bytes
        long long_variable; // consume 8 bytes
        byte_variable = 120;
        short_variable = 2354;
        int_variable = 12345;
        long_variable = 12345678901L; // input L behind the value if the value assign is big
        System.out.println("Byte value is: " + byte_variable);
        System.out.println("Short value is: " + short_variable);
        System.out.println("Int value is: " + int_variable);
        System.out.println("Long value is: " + long_variable);


        float float_variable; // consume 4 bytes
        double double_variable; // consume 8 bytes
        float_variable = 123.5F;
        double_variable = 456.456789789123456456789;
        System.out.println("Float value is: " + float_variable);
        System.out.println("Double value is: " + double_variable);


        char char_variable;
        char_variable = 'A';
        System.out.println("Char value is: " + char_variable);

        boolean boolean_variable;
        boolean_variable = false;
        System.out.println("boolean value is: " + boolean_variable);
    }
}
