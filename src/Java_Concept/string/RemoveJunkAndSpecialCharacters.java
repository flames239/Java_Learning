package Java_Concept.string;

public class RemoveJunkAndSpecialCharacters {
    public static void main(String[] args) {
        String str = "$*@Java Programming )@$$!*( 127367812";

        // Regular Expression
        // it removed Alphabets and Numbers
        String str1 = str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(str1);

        // it will remove non alphabets and number
        String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

        // it will remove number
        String str3 = str.replaceAll("[0-9]", "");
        System.out.println(str3);

        // it will remove non-number
        String str4 = str.replaceAll("[^0-9]", "");
        System.out.println(str4);

        // it will remove non alphabets
        String str5 = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str5);
    }
}
