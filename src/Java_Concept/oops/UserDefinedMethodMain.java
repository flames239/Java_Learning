package Java_Concept.oops;

public class UserDefinedMethodMain {
    public static void main(String[] args) {
        UserDefinedMethod udm = new UserDefinedMethod();
        udm.message1(); // method no params and return type

        double d = udm.message2(); // method no params, but have return type
        System.out.println(d);

        udm.message3("Nam"); // has params input, no return type
        udm.message4(844825125, "Ho Chi Minh City");
    }
}
