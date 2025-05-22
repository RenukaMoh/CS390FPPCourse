package lesson5.equals.equals.case3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	//Can use instanceof or same classes strategy here since no inheritance
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {

		GregorianCalendar d1 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d2 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d3 = new GregorianCalendar(1999, Calendar.OCTOBER, 15);
		Person p1 = new Person("John",d1);
		Person p2 = new Person("John",d2);
		Person p3 = new Person("David",d3);
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		System.out.println("p2.equals(p3) : " + p2.equals(p3));

	}

}
