package lesson10.setapi;

import java.util.*;

public class TreeSetDemo {

	public static void main(String args[]) {
		// Create a tree set
		Set<String> ts = new TreeSet<String>();
		// Add elements to the tree set

		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		ts.add("B");
		System.out.println(ts);

		Set<String> ts1 = new HashSet<String>();

		ts1.add(null);
		ts1.add("Hello");
		System.out.println(ts1);

		Map<String, String> map = new Hashtable<>();
		map.put("CS390","FPP");
		map.put("CS399","FPP");
		System.out.println(map);
		for(String s:ts1){
			System.out.println(s);
		}

	}
}
