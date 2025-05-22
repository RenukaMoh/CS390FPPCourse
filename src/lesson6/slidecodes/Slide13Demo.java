package lesson6.slidecodes;

class ClassA {
	// Member Inner class - not private
    class InnerClassA {
     }
}


public class Slide13Demo {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassA.InnerClassA innerA = a.new InnerClassA(); //ok
		/*ClassA.InnerClassA innerA1 =
				   new ClassA.InnerClassA();*/  //illegal
		// To fix it
	
		ClassA ob = new ClassA();
		ClassA.InnerClassA iob= ob.new InnerClassA();
		ClassA.InnerClassA innerA1 =
				   new ClassA().new InnerClassA(); //legal
	}
}
