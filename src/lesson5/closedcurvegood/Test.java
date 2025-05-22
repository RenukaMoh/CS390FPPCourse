package lesson5.closedcurvegood;

public class Test {
	
	public static void main(String[] args) {
		 ClosedCurve ob = new Circle(5);
		 ClosedCurve[] obj = new ClosedCurve[3];
		 System.out.println(obj.length);
		 ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3),
				 				new Rectangle(12,15)
								};

		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.getClass().getSimpleName() + " : " +cc.computeArea());
		}
		
    double av = computeAverage(obj);
    System.out.println(av);

		/*ClosedCurve[] obj1=null;
		av = computeAverage(obj1);*/
	}

	public static double computeAverage(ClosedCurve[] cc) {
		double ave = 0.0;
		double sum = 0.0;
		
		for(ClosedCurve c : cc ) {
			if(c!=null)
				sum = sum + c.computeArea();
		}
		ave = sum/cc.length;
		
		return ave;
	}
	
}