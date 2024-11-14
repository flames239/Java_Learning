package Java_Concept.string;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String str[] = {"C", "C++", "PHP", "Java", "C#", "Python", "JavaScript"};
        for( String x : str) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(str));
    }
}
