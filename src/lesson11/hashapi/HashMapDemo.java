package lesson11.hashapi;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> smap = new HashMap<>();
		smap.put("CS390", "FPP");
		HashMap<Integer,String> productMap = new HashMap<>();
		productMap.put(1, "Keys");
		productMap.put(4, "Books");
		productMap.put(3, "Systems");
		productMap.put(7, "Mobile");
		productMap.put(7, "Samsung");
		//productMap.put(7, "Samsung1");
		System.out.println(productMap);
		//productMap.put(13, null);
	//	productMap.put(13, "Laptop");
	//	productMap.put(null, "Apple");
		productMap.put(null, null);
		//productMap.put(null, "Apple");
		System.out.println(productMap);
		
		System.out.println(productMap.containsKey(4));
		System.out.println(productMap.get(4));
		System.out.println(productMap.containsValue("Books"));
		String val = productMap.get(3);
		System.out.println(val);
		// JDK 8 introduced a getOrDefault if the key or value not exist get default value
	}
}
