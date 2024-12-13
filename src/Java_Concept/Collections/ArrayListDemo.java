package Java_Concept.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();

    //    List list = new ArrayList();

    //    ArrayList<Integer> myList = new ArrayList<>();

        /// Adding data to Arraylist
        arrList.add(100);
        arrList.add("String here");
        arrList.add(234.5);
        arrList.add(234.5);
        arrList.add(true);

        int size = arrList.size();
        System.out.println(size);

        /// Print values in arrayList
        System.out.println(arrList);

        /// Remove element in ArrayList
        arrList.remove(2);
        System.out.println(arrList);

        /// Insert element at specific index
        arrList.add(2, "String add after delete index 2");
        System.out.println(arrList);

        /// Modify at specific Index in ArrayList
        arrList.set(2,"String modify Index");;
        System.out.println(arrList);

        /// Retrieve value at specific value
        System.out.println(arrList.getFirst());
        System.out.println(arrList.getLast());
        System.out.println(arrList.get(3));

        /// Retrieve all elements from ArrayList with Index
/*
        // 1
        for(int i = 0; i < arrList.size() - 1; i++) {
            System.out.println(arrList.get(i));
        }

        // 2
        for(Object x : arrList) {
            System.out.println(x);
        }
*/
        // 3 - using Iterator - Java collections
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /// Checking Arraylist is empty or not
        System.out.println(arrList.isEmpty());

        /// Remove some elements from the Arraylist
        ArrayList arrList2 = new ArrayList();
        arrList2.add("Abc");
        arrList2.add(123);
        arrList2.add('c');
        arrList2.removeAll(arrList2);
        System.out.println(arrList2);

    }
}