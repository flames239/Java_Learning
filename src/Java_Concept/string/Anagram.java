package Java_Concept.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // both word have same alphabets
        // silent - listen, care - race, now - won

        String str = "care";
        String str1 = "race";

        // check length of the string to make sure it equals
        if(str.length() == str1.length()) {
            // convert string to char arrays
            char Arraystr[] = str.toCharArray();
            char Arraystr1[] = str1.toCharArray();

            // Sort array char
            Arrays.sort(Arraystr);
            Arrays.sort(Arraystr1);

            // check if both sort are the same and it will be the anagram
            Arrays.equals(Arraystr,Arraystr1);
            System.out.println(str + " and " + str1 + " are aragram string");
        } else {
            System.out.println(str + " and " + str1 + " are not anagram String");
        }
    }
}
