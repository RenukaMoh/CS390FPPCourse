package lesson6.slidecodes;
public class Main { // Outer class
	public int i = 4; // instance field
	static int k = 10;// Static field
	// non static method
	public int getInt() { // Outer class instacne method
		return 3;
	}
	// Inner static class
	static class NestedClass {
		int sum=0;
		static int sum1 = 25;
		public void innerMethod() {
			//int j = i; // compiler error due to access of instance variable
		//	int k = getInt(); // compiler error due to access of instance method
			System.out.println(k);
			System.out.println(sum1);

		}
		public static void test(){
			System.out.println(k);
			System.out.println(sum1);
		}
	}
}