package lesson3.callbyvaluereference;

public class CallByValueInstanceVariables {
	Employee a = new Employee("Alice","Thompson", 60000, 1995, 2, 10);
	Employee b = new Employee("Bob","Rogers", 70000, 1997, 10, 1);
	public static void main(String[] args) {
		CallByValueInstanceVariables c = new CallByValueInstanceVariables();
		c.swap(c.a, c.b);
		//Cannot change value of a by sending a to a method
		System.out.println(c.a.getName());
		System.out.println(c.b.getName());
		c.swap();
		System.out.println(c.a.getName());
		System.out.println(c.b.getName());
	}
	public void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
	}
	public void swap() {
		Employee temp = a;
		a = b;
		b = temp;
	}
}
