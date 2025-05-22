package lesson11.loopthroughhashtabledemo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testloopthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Course> table = new Hashtable<>();
		
		table.put("CS390", new Course("CS390","FPP"));
		table.put("CS401", new Course("CS401","MPP"));
		table.put("CS472", new Course("CS472","Algorithms"));
		table.put("CS475", new Course("CS475","Android"));
		table.put("CS572", new Course("CS572","Advanced Algorithms"));
		
		// I need to print the Course names startswith "A"
		// Process collection using KeySet Approach
		System.out.println("1. Ket Set Approach");
		Set<String> sets = table.keySet();
		for(String s:sets) {
			Course c = table.get(s);
			if(c.getCname().startsWith("A"))
				System.out.println(c.getCname());
		}
		
		System.out.println("2. Iterator Approach");
		Iterator<String> it =  table.keySet().iterator();
		while(it.hasNext()) {
			String s = it.next();
			Course c = table.get(s);
			if(c.getCname().startsWith("A"))
				System.out.println(c.getCname());
		}
		System.out.println("3. Java 8 for each");
		table.forEach((key,value)->{
			if(value.getCname().startsWith("A"))
				System.out.println(value.getCname());
		});
		System.out.println("4. Using Table Entry Approach");
		Set<Entry<String,Course>> ent = table.entrySet();
		for(Entry<String,Course> e : ent) {
			Course c = e.getValue();
			if(c.getCname().startsWith("A"))
				System.out.println(c.getCname());
		}
		System.out.println("5. Using getValues from the Table");
	
		for(Course c : table.values()) {
			if(c.getCname().startsWith("A"))
				System.out.println(c.getCname());
		}
		List<String> rlist = listCnames(table,"A");
		System.out.println("Course list from the method" + rlist);
	}
	
	public static List<String> listCnames(Map<String,Course> table, String sw){
		if(table==null || sw == null)
				return null;
		
		List<String> list = new ArrayList<>();
		for(Course c : table.values()) {
			if(c.getCname().startsWith(sw)) {
				list.add(c.getCname());
			}
		}
		return list;
	}
	
}
