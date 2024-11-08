package Java_Concept.arrays;

import java.util.Arrays;

public class Reverse_Arrays {
    public static void main(String[] args) {

        int a[] = {2,1,5,8,9};

        // khai bao do dai cua mang truoc
        int rev[] = new int[a.length];

        // store elements in the rev array and is incremented progressively as you fill the array
        int index = 0;

        for(int i = a.length - 1; i >= 0; i --){
            rev[index] = a[i];
            index++;
        }
        for(int x = 0; x < rev.length; x++) {
            System.out.println(rev[x]);
        }
    }
}
