package lesson11.hashapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// Demo code for Hashset class
public class HashSetDemo {
		public static void main(String[] args) {
			HashSet<String> set = new HashSet();
			set.add("Java"); // Math.abs(input.hashCode()) % 16 -- index 0
			set.add("Swing");
			set.add("Java Spring");
			set.add("Banana");
			set.add(null);
			String ob = null;
			System.out.println(set.contains("Java"));


			set.add(null); // not allowed due to duplicates
			System.out.println(set);
			System.out.println("Removed Java from the set " + set.remove("Java Spring"));
			System.out.println("Set contains Swing : " +set.contains("Swing"));
			System.out.println("Size of the set : "+set.size());
			boolean res = set.add("Java");
			System.out.println(res);
		//	Set<Integer> ints = new HashSet<>(Arrays.asList(12,13,12,5,6,-8,9));
		//	System.out.println(ints);
	}
}
