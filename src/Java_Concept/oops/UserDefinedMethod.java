package Java_Concept.oops;

public class UserDefinedMethod {

    // 1. No input params, No return type
    void message1() {
        System.out.println("Method no input params, no return type: Copyright by java Oracle");
    }

    // 2. no input params, return type
    double message2() {
        System.out.println("Method with no input params, return type");
        return 2.5;
    }

    // 3. has input param, no return type
    void message3(String name) {
        System.out.println("My name is: " + name);
    }

    // 4. has param input, return type
    boolean message4 (int numberPhone, String address) {
        System.out.println("My number phone are: " + numberPhone + " and my address are: " + address);
        return true;
    }
}
