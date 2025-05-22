package lesson6.slidecodes;

class MyOuterClass {
	MyInnerClass inner;
	private String param;

	MyOuterClass(String param) {
		inner = new MyInnerClass("innerStr");
		this.param = param; // the outer class version of this
	}

	void outerMethod() {
		System.out.println(inner.param);
		inner.innerMethod();
		//String t = inner.this.innerParam; //compiler error
		//inner.innerMethod();
	}
	// Inner class
	class MyInnerClass {
		private String param;
	//	private static int x = 10; // Only from JDK 16
		MyInnerClass(String innerParam) {
			// the inner class version of 'this'
			this.param = innerParam;
		}
		void innerMethod() {
			// accessing enclosing class’s version of this
			System.out.println(MyOuterClass.this.param);
			// Both lines refer teh same
			System.out.println(param);
			System.out.println(this.param);
		}
	}
	public static void main(String[] args) {
		MyOuterClass oc = new MyOuterClass("outerStr");
		oc.outerMethod();
	}
}
