package Java_Concept.Collections;

import Java_Concept.looping_and_jumping.While;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
       //  Set mySet = new HashSet();
        // HashSet<String> hsString = new HashSet<>();

        hs.add("Abc");
        hs.add(123);
        hs.add(5.6);
        hs.add(5.6);
        hs.add(null);
        hs.add(null);
        hs.add('c');
        hs.add("Joke");
        hs.add(true);

        System.out.println(hs);

        hs.remove(null);
        System.out.println(hs);

        /// Insert in the middle of HashSet
        ///  Not possible to insert elements in between

        /// Remove specific element using index
        ///  Not possible to retrieve specific index


        /// Convert the HashSet into ArrayList
        ArrayList arrList = new ArrayList(hs);
        System.out.println(arrList.get(3));

        /// Retrieve All the elements from the HashSet
        ///  Normal for loop possible as no index

        ///  Enhance for loop
        for(Object s : hs) {
            System.out.println("Enhance values elements: " + s);
        }

        /// Using Iterator
        Iterator i = hs.iterator();
        while(i.hasNext()){
            System.out.println("Using Iterator: " + i.next());
        }

        // Clear all the elements
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.isEmpty());
    }
}
