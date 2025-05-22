package lesson5.defaultmethods;

public class Main {
	public static void main(String[] args) {
		NameAddress person1 = new MinimalPerson("Joe", "Stevens", "101 Adams",
				"Fairfield", "IA");
		NameAddress person2 = new PersonInDetail("Jim", "Thomas", "Radcliffe",
				new Address("17 Jones Pl.", "Apt. 2E", "New York", "NY", "01215"));
		
		NameAddress[] Lt = {person1,person2};
		print(Lt);
	}
	private static void print(NameAddress[]  list) {
		for(NameAddress na : list) {
			System.out.println(na + "\n" + "===============");
		}
	}
	
}
