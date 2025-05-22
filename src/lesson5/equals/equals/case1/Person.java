package lesson5.equals.equals.case1;

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
		//return dateOfBirth;
		return (GregorianCalendar)dateOfBirth.clone();
	}
	// Equals instanceof strategy
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person p)) return false;
		//Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}

}
