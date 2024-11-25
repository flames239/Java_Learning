package Java_Concept.oops;

public class ConstructorOverloading {

    String text;
    String firstName;
    String lastName;

    ConstructorOverloading() {
         text = "Rap Viet";
         firstName = "";
         lastName = "";
         System.out.println(text + " " + firstName + " " + lastName);
    }

    ConstructorOverloading(String fname) {
        // param constructor with one inputs
        text = "hi";
        firstName = fname;
        lastName = "";
        System.out.println(text + " " + firstName + " " + lastName);

    }

    ConstructorOverloading(String fname, String lname) {
        // param constructor with two inputs
        text = "hi there";
        firstName = fname;
        lastName = lname;
        System.out.println(text + " " + firstName + " " + lastName);
    }
}
