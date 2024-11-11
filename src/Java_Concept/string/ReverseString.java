package Java_Concept.string;

public class ReverseString {
    public static void main(String[] args) {
        // Approach 1
        String str = "Nam Ha";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("After reverse: " + rev);


        // Approach 2
        String str1 = "Selenium Webdriver";
        String rev1 = "";

        char contain[] = str1.toCharArray();
        for (int i = contain.length - 1; i >= 0; i--) {
            rev1 = rev1 + contain[i];
        }
        System.out.println(rev1);

    }
}
