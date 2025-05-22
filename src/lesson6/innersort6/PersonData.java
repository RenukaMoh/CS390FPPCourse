package lesson6.innersort6;

import java.util.Arrays;

/** Processes person data. Makes use of an anonymous inner class */
public class PersonData {
	public static void main(String[] args) {
		Person[] persons = prepareData();
		Arrays.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println(Arrays.toString(persons));
	}

	static Person[] prepareData() {
		Person[] persons = {new Person("Joe"), new Person("Bob"), new Person("Anne")};
		return persons;
	}
}
