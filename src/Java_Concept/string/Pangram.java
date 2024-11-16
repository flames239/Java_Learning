package Java_Concept.string;

public class Pangram {
    public static void main(String[] args) {
        // All alphabet from a to z (all 26 alphabets)
        String str = "the quick b fox jumps over the lazy dog";
        int flag = 1; // assumption
        if (str.length() < 26) {
            System.out.println(str + " is not pangram string");
        } else {
            // pangram string
            for (char ch = 'a'; ch <= 'z'; ch++) { // ascii code - numbers , one missing character
                if (str.indexOf(ch) < 0) {
                    // it not a pangram string
                    flag = 0;
                }

            }
            if(flag == 1) {
                System.out.println(str + " is an pangram string");
            } else {
                System.out.println(str + " is not pangram string");
            }

        }
    }
}
