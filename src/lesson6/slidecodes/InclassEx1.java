package lesson6.slidecodes;

public class InclassEx1 {
	private MyInner inner;
	public MyInner getMyInner() {
		//return inner; // Throw NullPointer exception
		inner = new MyInner(10);
		return inner;
	}
	@SuppressWarnings("unused")
	private class MyInner {
		private int innerInt;	
		MyInner(int x) {
			innerInt = x;
		}
	}
	public static void main(String[] args) {
		InclassEx1 mc = new InclassEx1();
		MyInner  mi = mc.getMyInner();
		System.out.println(mi.innerInt);
	}
}
