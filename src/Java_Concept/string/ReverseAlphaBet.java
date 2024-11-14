package Java_Concept.string;

import java.util.Arrays;

public class ReverseAlphaBet {
    public static void main(String[] args) {
        String str = "abc123gr24xyz";

        // declare left and right variable
        int left = 0;
        int right = str.length() - 1;

        // convert string to new char arrays
        char ch[] = str.toCharArray();

        // using while loop to handle this
        while (left < right) {
            // check if in string have digit number from 0 - 9
            if(Character.isDigit(ch[left])) {
                left++;
            } else if (Character.isDigit(ch[right])) {
                right--;
            } else { // Swapping value
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(str);
        System.out.println(ch);
    }
}
