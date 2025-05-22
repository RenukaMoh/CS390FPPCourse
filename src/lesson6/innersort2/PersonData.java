package lesson6.innersort2;

import java.util.Arrays;
import java.util.Comparator;

/** Processes person data. Makes use of an inner class NameComparator */
public class PersonData {
	private class NameComparator implements Comparator<Person>{
		@Override
		public int compare(Person p1, Person p2) {
			return p1.getName().compareTo(p2.getName());
		}
	}
	public static void main(String[] args) {
		PersonData pd = new PersonData();
		Person[] persons = prepareData();
		Arrays.sort(persons, pd.getNameComparator());
		System.out.println(Arrays.toString(persons));
	}
	static Person[] prepareData() {
        return new Person[]{new Person("Joe"), new Person("Bob"), new Person("Anne")};
	}
	/* Provide getter for external use of the inner class NameComparator */
	private NameComparator getNameComparator() {
		return new NameComparator();
	}
	
	
}
