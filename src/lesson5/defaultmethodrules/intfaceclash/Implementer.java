package lesson5.defaultmethodrules.intfaceclash;

abstract public class Implementer implements SupInt1, SupInt2 {
	//clash must be resolved, either by making myMethod abstract
	//as is done here, or by overriding it in a new default method
   abstract public void myMethod(int x);
}
