package lesson5.defaultmethodrules.intfacesupclass;

public class Implementer extends SupClass implements SupInt1 {
	public static void main(String[] args) {
		Implementer i = new Implementer();
		i.myMethod(3);
	}
}
