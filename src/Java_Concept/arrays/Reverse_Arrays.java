package Java_Concept.arrays;

public class Reverse_Arrays {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};

        // khai bao do dai cua mang truoc
        int rev[] = new int[a.length];

        // khai bao index = 0 de kiem tra
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
