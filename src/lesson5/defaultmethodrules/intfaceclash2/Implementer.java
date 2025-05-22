package lesson5.defaultmethodrules.intfaceclash2;

public class Implementer implements SupInt1, SupInt2 {
	//clash must be resolved, either by making myMethod abstract
	//as is done here, or by overriding it in a new default method
	public static void main(String[] args) {
		Implementer ob = new Implementer();
		ob.myMethod(5);
		
	}
   public void myMethod(int x) {
	   SupInt2.super.myMethod(x);
    	System.out.println("hello");
   }
}

