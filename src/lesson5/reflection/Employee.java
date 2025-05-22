package lesson5.reflection;

import java.lang.reflect.InvocationTargetException;
import java.sql.Time;

public class Employee {
	private String name;
	private int salary;
	public Employee() {
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int sal) {
		this.salary = sal;
	}
	
	@Override
	public String toString() {
		return name + ": " + salary;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String className = "lesson5.reflection.Employee";
		Class empClass = Class.forName(className);
		Employee emp = (Employee)empClass.getDeclaredConstructor().newInstance();
		emp.setName("Bob");
		emp.setSalary(85000);
		System.out.println(emp);
		Object o;
		Time t;

	}
}


