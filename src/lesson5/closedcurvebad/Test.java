package lesson5.closedcurvebad;
// Non - OO pattern
class Test {
	public static void main(String[] args) {

		Object[] objects = { new Triangle(5, 5, 5), new Square(3),
				new Circle(3) };
		// If I handle in non OO way, you need to do downcasting, - Anti OO patteren
		//Object c = new Circle(4);
			//double d = 	((Circle) c).computeArea();

				
		Object o1 = new Triangle(5,6,6);
				double t11 = ((Triangle) o1).computeArea();
		System.out.println(t11);
		
		// computeArea() is not visible to object, you need to do douncasting
		// Anti-oo pattern
		((Triangle) o1).computeArea();
		
		// compute areas
		for (Object o : objects) {
		    if (o instanceof Triangle) {
		    	Triangle t = (Triangle) o; // Downloading
				System.out.println(  t.getClass().getSimpleName() + " : " +t.computeArea());
			}
			if (o instanceof Square) {
				Square s = (Square) o;
				System.out.println(s.getClass().getSimpleName() + " : " +s.computeArea());
			}
			if (o instanceof Circle) {
				Circle c = (Circle) o;
				System.out.println(c.getClass().getSimpleName() + " : " +c.computeArea());
			}
		}
	}
}
