package Java_Concept.string;

public class StringPrograms {
    public static void main(String[] args) {
        // Approach 1
        String str = "AutoMation";
        // output is AM
        String rpl = str.replaceAll("[a-z]", "");
        System.out.println("After string replace: " + rpl);

        // Approach 2
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                result += ch;
            }
        }
        System.out.println("Approach 2 String Program is: " + result);
    }
}
