package lesson5.interfacedemo;

public class Test {
	
	public static void main(String[] args) {

		 ClosedCurve ob = new Circle(5);
		
		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.getClass().getSimpleName() + " : " +cc.computeArea());
			
		}
    
	}

}