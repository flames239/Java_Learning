package Java_Concept.string;

public class Example2 {
    public static void main(String[] args) {
        // trim() - remove the space from both side of the String
        String str = " Nam ";

        System.out.println("Not using trim:" + str);
        System.out.println("Using trim:" + str.trim());

        //charAt() -- returns an specified index in String
        // return single characters in the String
        String str1 = "Java Object Oritent Program";
        // int indexStr1 = str1.charAt(2); converted to corresponding ASCII (or Unicode) => so it print results = 118
        System.out.println("charAt index Str1 is: " + str1.charAt(2));
    }
}
