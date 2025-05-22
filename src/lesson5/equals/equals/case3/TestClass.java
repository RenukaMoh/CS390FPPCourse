package lesson5.equals.equals.case3;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* Case 3: For the code in package case3, Person and PersonWithJob must be equipped
 *  with different equals methods, exactly as in Case 2. 
 *  However, in this case, you must handle this requirement by using
 *  composition instead of inheritance.  */

public class TestClass {

	public static void main(String[] args) {
		
		GregorianCalendar d1 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d2 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d3 = new GregorianCalendar(1999, Calendar.OCTOBER, 15);
				
		PersonWithJob pj1 = new PersonWithJob("John",d1,5000);
		PersonWithJob pj2 = new PersonWithJob("John",d2,5000);
		PersonWithJob pj3 = new PersonWithJob("John",d3,6000);

		System.out.println("pj1.equals(pj2) : " + pj1.equals(pj2));
		System.out.println("pj2.equals(pj3) : " + pj1.equals(pj3));

	}

}
