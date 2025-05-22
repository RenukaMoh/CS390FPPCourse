package lesson6.innersort3;

import java.util.Arrays;

/** Processes person data. Accesses the static nested class NameComparator 
 *  stored in Person 
 */
public class PersonData {
	public static void main(String[] args) {
		Person[] persons = prepareData();
		Arrays.sort(persons, new Person.NameComparator());
		System.out.println(Arrays.toString(persons));
	}
	static Person[] prepareData() {
		Person[] persons = {new Person("Joe"), new Person("Bob"), new Person("Anne")};
		return persons;
	}
}
