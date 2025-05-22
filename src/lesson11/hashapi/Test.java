package lesson11.hashapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> coll = new HashSet<>();
		coll.add(10);
		coll.add(10);
		coll.add(35);
		coll.add(45);
		coll.add(80);
		//System.out.println(coll);
		HashSet<Integer> coll1 = new HashSet<>(Arrays.asList(34,67,10,45));
		coll.addAll(coll1);
	//	System.out.println(coll);
		
		// Map Interface
		
		Map<String,String> srs = new HashMap<String,String>();
		srs.put("CS390", "FPP");
		srs.put("CS401", "MPP");
		srs.put(null, "Algorithms");
		srs.put("CS434", null);
		System.out.println(srs);
		srs.put("CS434", "WAP");
		System.out.println(srs);
		String fpp = srs.get("CS390");
		boolean res = srs.containsKey("CS500");
		System.out.println(res);
		res = srs.containsValue("MPP");
		System.out.println(res);
				
		// Hash Table - does not allow null key and null value
		Map<String,String> srs1 = new Hashtable<String,String>();
		srs1.put("CS390", "FPP");
		srs1.put("CS401", "MPP");
		srs1.put("CS566", "Algorithms"); 
	//	 srs1.put("CS434", null); // null key throw exception
		System.out.println(srs1);
		
	}

}
