package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAPI {
	public static void main(String[] args) {
		// without specifying, a type is called Raw Type, it is Object type, Pre JDK 5
		ArrayList list = new ArrayList();
		// Drawback of Raw Type, need to down casting to retrieve as a specific
		list.add(10); // Integer
		list.add("Java"); // String
		list.add(new Apple()); // Apple
		
		int x = (int)list.get(0);
		
		// JDK - 5, got Genetics- <Type>, Type only accept Reference type, 
		//cannot pass Primitive type
		// How to create Generic Array List
		ArrayList<Integer> nums = new ArrayList<>(); // Default Capacity is 10
		// If you the capacity better intialize capacity through constructor
		// To improve the performance
		ArrayList<Integer> nums1 = new ArrayList<>(100); 
		nums.subList(0,2);
		// To acheive polymorphism can declare as  List
		//List<String> slist = new List<>(); // List is Interface
		List<String> slist = new ArrayList<>();
		slist.add("Java");
		// Advantages of Generics, get compiler verification
		//slist.add(10);
		System.out.println(slist);
		slist.add(0,"C++");
		System.out.println(slist);
		System.out.println(slist.get(0));// Not in the range of 0 to size-1 cause Exceptions
		List<String> slist1 = new ArrayList<>(Arrays.asList(
				"FPP","MPP","WAA"));
		slist.set(1, "VC++");
		slist.lastIndexOf("WAA");
		slist.add(1, "Java");
		slist.addAll(slist1);
		System.out.println(slist);
		/*System.out.println(slist);
		System.out.println(slist.size());
		System.out.println(slist.isEmpty());
		System.out.println(slist.contains("FPP"));*/
		
		
		// Create a list Apple
		
		/*List<Apple> apples = new ArrayList<>();
		Apple a1 = new Apple();
		Apple a2 = new Apple("Red",2.3,4.5);
		Apple a3 = new Apple("Red",2.3,4.8);
		apples.add(a1);
		apples.add(0,a2);
		apples.add(new Apple());
		System.out.println(apples);
		System.out.println(apples.contains(a3));
		apples.set(1, a3);
		System.out.println(apples);*/
		
		// JDK 10 the keyword var is introduced to infer type sutimatically
		
		int  y = 10; 
		var  y1 = 20;
	//	y1 = 12.3;
		var apples1 = new ArrayList<Apple>();
		apples1.add(new Apple());
		
		
	}

}
