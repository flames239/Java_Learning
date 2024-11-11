package Java_Concept.string;

public class Example3 {
    public static void main(String[] args) {
        // contains() -- returns boolean value true/false
        // check given string
        String s1 = "Nam Ha"; // main string
        String s2 = "m H"; // part of main string
        System.out.println("Result 2 string using contains: " + s1.contains(s2));

        // equals - compare String
        String str1 = "Nam Ha";
        String str2 = "nam ha";
        System.out.println("Result compare 2 string using equals: " + str1.equals(str2));

        // equalsIgnoreCase - compare string - upper or lower case will case
        String str3 = "Nam Ha";
        String str4 = "nam ha";
        System.out.println("Result compare 2 string using equalsIgnoreCase: " + str3.equalsIgnoreCase(str4));

        // contentEquals
        String str5 = "Nam Ha";
        String str6 = "Nam Ha";
        System.out.println("Result using contentEquals: " + str5.contentEquals(str6));

    }
}
