package lesson10.setapi;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Map accepts Key, Value - No primitive, object type
        TreeMap<String,String> map = new TreeMap<>();
        // Inserting call put, no add method
        map.put("CS390","FPP");
        map.put("CS401","MPP");
        map.put("CS435","Algorithms");
        map.put("CS420","WAP");
        map.put("CS411","MPP");
        map.put("CS420","WAP"); // No Duplicate
        // Key is same data is different will do replace the value
        map.put("CS420","Web Application");
      //  map.put(null,"WAA"); // Cause NPE for null key
        map.put("CS533", null); // Value can be null
        System.out.println(map);
        // To retrieve the data, pass the key and the value
        String val = map.get("CS390");
        System.out.println("Value for CS390 = " + val);

        TreeMap<Integer,Apple> map1 = new TreeMap<Integer,Apple>();
        map1.put(123,new Apple());
        map1.put(111,new Apple("Red",4.5,6.7));
        map1.put(153,new Apple("Yellow",4.8,6.9));
        map1.put(123,null); // Key cannot be null, value can be null

        System.out.println(map1);

    }
}
