package Java_Concept.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
    //    HashMap hm = new HashMap();
    //    Map m = new HashMap();
        HashMap<String, Integer> hm1 = new HashMap<>();

        /// Adding values
        hm1.put("Nam", 11464);
        hm1.put("Ha", 10225);
        hm1.put("Linh", 10025);

        System.out.println("After Add key and values: " + hm1);

        hm1.put("Manh", 11584);
        hm1.put("Nam", 11515);
        System.out.println("Adding one more key and value: " + hm1);

        System.out.println("Size of HashMap: " + hm1.size());

        ///  Remove one key value pair
        hm1.remove("Manh");
        System.out.println("After remove key pair: " + hm1);

        /// Retrieve value of a given key
        System.out.println("Get value of given key: " + hm1.get("Nam"));

        /// Retrieve all the key and value
        System.out.println("Retrieve only key: " + hm1.keySet()); // All key
        System.out.println("Retrieve only value: " + hm1.values()); // All values
        System.out.println("Retrieve both key and value: " + hm1.entrySet()); // Both key and values

        /// Retrieving data from the Hash Map
        /// Using for each loop
        for (String k: hm1.keySet()) {
            System.out.println(k + "  " + hm1.get(k));

        }

        /// Using Iterator
        Iterator<Map.Entry<String, Integer>> i = hm1.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            System.out.println("Get key:" + entry.getKey() + " and " + "get value: " + entry.getValue());
        }
    }
}
