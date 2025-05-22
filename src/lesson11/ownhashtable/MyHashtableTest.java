package lesson11.ownhashtable;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MyHashtableTest {
	public static void main(String args[]){
		MyHashtable table = new MyHashtable();
		//MyHashtable table1 = new MyHashtable(17);
		table.put("CS390", "FPP");
		table.put("CS401", "MPP");
		table.put("CS473", "Android");
		//System.out.println(table);
		table.put("CS473", "Kotlin");
		table.put("CS453", "WAP");
		table.put("CS478", null); // Accepts null  value
	//	table.put(null, "Java");
//	table.put(null, "Algorithms"); //Does not allow null keys
		System.out.println(table);
		System.out.println("Table Size : " + table.size());
		System.out.println("isEmpty() :" + table.isEmpty());
		Object val = table.get("CS473");
		System.out.println("Value for the Key CS473 is : " + val);
	}
}
