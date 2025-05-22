package lesson5.reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) 
			throws ClassNotFoundException, InstantiationException, 
			   IllegalAccessException, IllegalArgumentException, 
			   InvocationTargetException, NoSuchMethodException, 
			   SecurityException {
		
		String className = "lesson5.reflection.Employee";
		
		//creates a Class object based on String name
		Class<?> empClass = Class.forName(className); 
		
		//locates the no-argument constructor for Employee and invokes it
		Employee emp = (Employee)empClass.getDeclaredConstructor().newInstance();
		
		//sets name and salary in the Employee shell
		emp.setName("Bob");
		emp.setSalary(85000);
		
		//invokes Employee's toString method
		System.out.println(emp);
	}
}


