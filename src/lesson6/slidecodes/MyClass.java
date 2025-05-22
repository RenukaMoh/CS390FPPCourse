package lesson6.slidecodes;

// Outer class / Enclosing class
public class MyClass {
	private String s = "hello"; // Outer class member
	private int x = 20;
	public static void main(String[] args){
		new MyClass();

	}
	// Constructor
	MyClass() {
		MyInnerClass myInner = new MyInnerClass();
		System.out.println(myInner.intval); // Access private with object reference
		System.out.println(myInner.x);
		myInner.innerMethod();
	}
	// Inner class
	private class MyInnerClass{
		private static float f= 23.45f; // Only JDK 16, possible 
		private int x = 30;
		private int intval = 3; // Inner class member
		private void innerMethod(){ // Inner class method
			System.out.println(s); // Outer class member inside inner class even private
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(MyClass.this.x);
			//System.out.println(new MyClass().x);
		}
}
}

