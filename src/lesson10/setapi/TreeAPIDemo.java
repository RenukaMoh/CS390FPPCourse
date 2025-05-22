package lesson10.setapi;

import java.util.TreeMap;
import java.util.TreeSet;
public class TreeAPIDemo {
	public static void main(String[] args) {
		// TreeSEt does not allow null
		TreeSet<String> col1 = new TreeSet<>();
		col1.add("Java");
		col1.add("C++");
		col1.add("Scala");
		boolean res = col1.add("Java");
		System.out.println(res);
		System.out.println(col1);
		System.out.println("Size = " + col1.size());
		col1.add("Angular");
		col1.add("HTML");
		//col1.add(null); // Cause NPE
		System.out.println(col1);
		System.out.println("Size = " + col1.size());
		System.out.println("Min = " + col1.first());
		System.out.println("Max = " + col1.last());

		// Collection go with Comparable by default price as key
		TreeSet<Apple> app = new TreeSet<>();
		 app.add(new Apple("Red",4.5,6.7));
		 app.add(new Apple("Green",2.5,4.7));
		 app.add(new Apple("Yellow",4.5,3.4));
		app.add(new Apple("Yellow",4.5,3.4));
		 System.out.println(app);
		 // Go with a Comparator key is color, pass through com ob inside Constructor
		 TreeSet<Apple> app1 = new TreeSet<>(new AppleColorCom());
		 app1.add(new Apple("Red",4.5,6.7));
		 app1.add(new Apple("Green",2.5,4.7));
		 app1.add(new Apple("Yellow",4.5,3.4));
		 System.out.println(app1);


		 TreeMap<String, String> map = new TreeMap<>();
		 // map.put(null,"FPP"); // Key not to be null for TreeMap
		 map.put("CS401", "MPP");
		map.put("CS421", "Algorithms");
		map.put("CS473", "MDP");
	System.out.println(map);
	  map.put("CS421", "Advanced Algorithm");
	System.out.println(map);
	// How to retrieve the value
	String val = map.get("CS401");

	System.out.println(val);
	TreeMap<String,Apple> cmap1 = new TreeMap<>();
	// TreeMap<Pair, Employee> ob; // Pair must have comparable/ Comparator
	}
}
