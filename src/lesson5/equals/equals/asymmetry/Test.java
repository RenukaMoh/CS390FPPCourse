package lesson5.equals.equals.asymmetry;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("Joe");
		PersonWithJob withJob = new PersonWithJob("Joe", 100000);
		System.out.println(p.equals(withJob));// PersonwithJob is a person
		System.out.println(withJob.equals(p)); // Not Person is a PersonWithJob

	}
}
