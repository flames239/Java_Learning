package Java_Concept.string;

public class CountWord {
    public static void main(String[] args) {
        String str = "Hoc Java Mien Phi Moi Ngay Tai Udemy";
        int count = 1; // initial count = 1

        // loop through the String given
        for (int i = 0; i < str.length(); i++) {
            //check index character have space and not have space
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                count++;
            }
        }
        System.out.println("String given have: " + count +" word");
    }
}
