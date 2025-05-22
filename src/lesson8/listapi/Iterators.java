package lesson8.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> alist = new ArrayList<>();
		 alist.add(new Apple());
		 alist.add(new Apple("Green",2,1.5));
		 alist.add(new Apple("Yellow",2.5,1.2));
		 alist.add(new Apple("Gold",1.5,2.2));
		 alist.add(new Apple("Gold",1.5,2.7));
		// System.out.println(alist);
		 // Task : Print the list of Apples which starts with "G"
		 // Regular index based approach
		
		 
		 ArrayList<String> stringArray = new ArrayList<String>(
					Arrays.asList("Hello", "Welcome", "Java","Object",
							"Array", "String", "Inheritance","Swing"));
		 // Using Iterator to process the collection
		Iterator<String> it1 =  stringArray.iterator();
		// Print the String has more than 5 length
		while(it1.hasNext()) {
			String inp = it1.next();// To read the data call next
			if(inp.length()>5)
				System.out.println(inp);
		}
		
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(10);
		nums.addFirst(23);
		nums.addLast(30);
		System.out.println(nums.contains(10));
		System.out.println(nums);
		System.out.println(nums.get(2));
		
		Iterator<Integer> it2 = nums.iterator();
		
		// Sum of data nums
		int sum = 0;
		while(it2.hasNext()) {
			sum+=it2.next();
		}
		System.out.println("Sum = " +sum);
		ListIterator<Integer> it3 = nums.listIterator(nums.size());
		System.out.println("Reversed order");
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
		
		// Various approaches to loop through collections
		// 1. For using Index based approach
		int c = 0;
		for(int i=0;i<alist.size();i++) {
			Apple ob = alist.get(i);
			if(ob.getWt()>2.0) 
				c++;
		}
		System.out.println("Index based loop count = " + c);
		
		// 2. For each
		c = 0;
		for(Apple ob: alist) {
			if(ob.getWt()>2.0) 
				c++;
		}
		System.out.println("For each based loop count = " + c);
		c=0;
		// 3. Iterator
		Iterator<Apple> it4 = alist.iterator();
		while(it4.hasNext()) {
			Apple a = it4.next();
			if(a.getWt()>2.0) 
				c++;
		}
		System.out.println("Iterator loop count = " + c);
		// 4. Lambda
		System.out.println("Lambda >2.0 weight");
		alist.forEach(x->{
			if(x.getWt()>2.0)
				System.out.println(x);
		});
	}
	// If you make the type of super, in the below method, 
	//you can pass ArrayList, LinkedList
	public void print(List<String> list) {
		
	}

}
