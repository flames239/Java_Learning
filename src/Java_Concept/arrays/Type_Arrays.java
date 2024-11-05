package Java_Concept.arrays;

public class Type_Arrays {
    public static void main(String[] args) {
        /*
        * arrays is a collection of same data types
        * Single Dimensional
        * Two Dimensional
        * */

        // Single Dimensional Arrays
        // Approach 1
        int a[] = new int[5]; // declaration
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        a[3] = 13;
        a[4] = 14;

        /*
        * Cach in gia tri mảng
        * 1: khai bao mang - gan gia tri
        * 2: khai bao do dai cua mang
        * 3: dung vong lap de in tung gia tri trong mang
        * */
        // khai bao do dai cua mang
//        int length = a.length;
//        System.out.println("length of arrays : " + length);

        // dung vong lap de in tung gia tri trong mang
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("----------------------------");

        // For each loop -> using in Collection (Arrays, ArraysList, ...)
        for(int i : a) { // for (declare variable 1 : variable 2 [arrays itself])
            System.out.println(i);
        }

        // Approach 2
        String b[] = {"Nam", "Ha", "Nguyen", "Phuong"};
        long length1 = b.length;

        System.out.println("length of the String Arrays: " + length1);
    }
}
