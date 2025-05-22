package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayAPIUsage {
	public static void main(String[] args) {
		List<Apple> aplist = new ArrayList<>();
		aplist.add(new Apple());
		 Apple a2 = new Apple("Green",3.3,2.5);
		 Apple a1 = new Apple("Green",2.3,1.5);
		 Apple look = new Apple("Green",2.3,1.5);
		 aplist.add(a2);
		 aplist.add(a1);
		 System.out.println(aplist);
		 boolean res = aplist.contains(look);
		 System.out.println(res);
		// Sort an Apple collection using weight
		 
		 Collections.sort(aplist, new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getWt(), o2.getWt());
			}
			 
		 });
		 System.out.println(aplist);
		 // Sorting
		List<String> clist = new ArrayList<>(Arrays.asList(
				"FPP","MPP","WAA","MPP","ASD","MWA","DBMS","MDP"));

		System.out.println("Before sort:" + clist);
		Collections.sort(clist);
		System.out.println("After sort:" + clist);
	//	System.out.println("Reversed List");
	//	Collections.sort(clist,Collections.reverseOrder());
	//	System.out.println(clist);
		
		// Binary Search
		int ind = Collections.binarySearch(clist, "WAA");
		System.out.println("Index of WAA " + ind);
		ind = Collections.binarySearch(clist, "SWE");
		System.out.println("Index of SWE " + ind);
	}
}
