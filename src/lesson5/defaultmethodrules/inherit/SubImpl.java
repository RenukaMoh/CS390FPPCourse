package lesson5.defaultmethodrules.inherit;

public class SubImpl implements SubIntface {
	public static void main(String[] args) {
		SubImpl ob = new SubImpl();
		ob.myMethod(10);
		//(new SubImpl()).myMethod(3);
	}
}
