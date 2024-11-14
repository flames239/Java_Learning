package Java_Concept.string;

public class PalindromeString {
    public static void main(String[] args) {
        // Palindrome mean reverse string with same string provide: civic, refer, racecar, ...
        String str = "racecar";
        String rev = ""; // Empty String

        for (int i = str.length() - 1; i >= 0 ; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
