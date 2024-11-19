package Java_Concept.string;

public class CountOccurrencesInString {
    public static void main(String[] args) {
        // refers to the process of determining how many times a particular element
        // (such as a character, word, or number) appears within a dataset
        String str = "Hoc Java Mien Phi Moi Ngay Tai Udemy";
        int leng = str.length();
        int temp = str.replace("o","").length();
        int count =  leng - temp;
        System.out.println("Count occurrences in string given: " + count);
    }
}
