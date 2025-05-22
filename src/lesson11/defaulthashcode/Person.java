package lesson11.defaulthashcode;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	String firstName;
	String lastName;
	double salary;
	LocalDate dob;
	public Person(String fname, String lname, double salary, LocalDate dob) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
		this.dob = dob;
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return firstName.equals(p.firstName)
				&& lastName.equals(p.lastName) 
				&& salary == p.salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", salary=" + salary +
				", dob=" + dob +
				'}';
	}
}
