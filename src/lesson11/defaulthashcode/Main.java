package lesson11.defaulthashcode;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Joe", "Smith", 100000, LocalDate.of(1988, 5, 5));
		System.out.println(p.hashCode());
		
		Person p1 = new Person("Joe", "Smith", 100000, LocalDate.of(1988, 5, 5));
		System.out.println(p1.hashCode());
		System.out.println(p1.equals(p));

		// Create HashSet to understand the importance of overriding hashcode()
		HashSet set = new HashSet();
		//set.add(p);
		//set.add(p1);
		//System.out.println(set);
	}

}
