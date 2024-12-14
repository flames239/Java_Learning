package Java_Concept.Collections;

import Java_Concept.oops.BankAccount;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("Abc");
        arrString.add("Def");
        arrString.add("Ghj");
        System.out.println(arrString);
        System.out.println(arrString.get(2));

        Iterator<String> iString = arrString.iterator();
        System.out.println(iString.next());
        while (iString.hasNext()){
            System.out.println(iString.next());
        }

       // ArrayList<BankAccount> arrBA = new ArrayList<>();

    }
}
