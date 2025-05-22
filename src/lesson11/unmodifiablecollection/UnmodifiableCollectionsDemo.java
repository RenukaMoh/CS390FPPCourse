package lesson11.unmodifiablecollection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import static java.util.Map.entry;

public class UnmodifiableCollectionsDemo {
    public static void main(String[] args) {
        // Unmodifiable List
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        // JDK 8
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(STR."Unmodifiable List: \{unmodifiableList}");
        // If you try to add or remove or update, throw UnsupportedOperationException
     //  unmodifiableList.add("four");
       // unmodifiableList.remove(1);
        // JDK 9 or later
        List<String> unmodifiableList1 = List.of("one","two","three");
        System.out.println(STR."Unmodifiable List: \{unmodifiableList1}");

        // Unmodifiable Set
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Blue");
        set.add("Yellow");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);

        Set<String> unmodifiableSet1 = Set.of("Pink","White","Black");
        System.out.println("Unmodifiable Set: " + unmodifiableSet1);

        // Unmodifiable Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);
        Map<String, Integer> unmodifiableMap1 = Map.of("one", 1,"two", 2,"three", 3);
        System.out.println("Unmodifiable Map: " + unmodifiableMap1);

        // If you more than 10 entries use Map.ofEntries(), for Unmodifiable map
        Map <Integer, String> friendMap = Map.ofEntries(
                entry(1, "Tom"),
                entry(2, "Dick"),
                entry(3, "Harry"),
                entry(99, "Mathilde"));
        System.out.println(friendMap);
    }
}
