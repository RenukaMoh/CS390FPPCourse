package lesson5.equals.equals.case2;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* Case 2: For the code in package case2, Person and PersonWithJob must be equipped 
 * with different equals methods. As in Case 1, two Persons should be considered equal 
 * if they have the same name and date of birth. 
 * However, in Case 2, two instances of PersonWithJob will be considered equal 
 * only if they have the same name, date of birth, and salary. 
 * Implement this requirement using the same classes strategy.  */

public class TestClass {
	public static void main(String[] args) {
		GregorianCalendar d1 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d2 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d3 = new GregorianCalendar(1999, Calendar.OCTOBER, 15);
		Person p1 = new Person("John",d1);
		Person p2 = new Person("John",d2);
		Person p3 = new Person("David",d3);
		System.out.println("p1.equals(p2) : " + p1.equals(p2)); 									 //true            // true
		System.out.println("p2.equals(p3) : " + p2.equals(p3));  												//false            // false
		System.out.println(p1.getClass().getSimpleName());

		PersonWithJob pj1 = new PersonWithJob("John",d1,5000);
		PersonWithJob pj2 = new PersonWithJob("John",d2,5000);
		System.out.println("pj1.equals(pj2) : " + pj1.equals(pj2));  								// true             // true
		System.out.println("pj1.equals(p1) : " + pj1.equals(p1));
		System.out.println(pj1.getClass());
		System.out.println(p1.getClass());
		}

}
