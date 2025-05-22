package lesson5.instanceoff;
public class InstanceofDemo {
		public static void main(String[] args) {
			// Checking instanceof for Number class
			Object[] stuff = {"Java", 10.11, 12, 13, 16.11, 20, "Hi"};
			double sum = 0;
			for (int i = 0; i < stuff.length; i++) {
				// Pre Java 14 instanceof
				if (stuff[i] instanceof Number) { // checking instance
					Double next = (Double) stuff[i]; // Down casting
					sum += next;
				}
			}
			System.out.println("Sum of Doubles = " +sum);
			sum = 0;
			for (int i = 0; i < stuff.length; i++) {
				// Using JDK 14 pattern matching instance of
				if (stuff[i] instanceof Number next) { // checking instance
					sum += next.doubleValue();
				}
			}
			System.out.println("Sum of Doubles = " + sum);
			// Using JDK 14 pattern matching instance of
			for (int i = 0; i < stuff.length; i++) {
				// Using JDK 14 pattern matching instance of
				if (stuff[i] instanceof String s) { // checking instance
					System.out.println(s.toUpperCase());
				}
			}
		}
}
