package lesson8.listandpolymorphism;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	public static void main(String[] args) {
		List<ClosedCurve> objects = new ArrayList<>();
		objects.add(new Rectangle(5,7));
		objects.add(new Rectangle(2,9));
		objects.add(new Circle(6));
		System.out.println(objects.size());
		List<Circle> cir = new ArrayList<>();
		cir.add(new Circle(7));
		cir.add(new Circle(8));
		objects.addAll(cir);
		System.out.println(objects.size());
		// Java 10 approach using var
		var c1 = new Circle(8);
		int x = 10;
		var x1 = 20; // Infer type from the data
						
		System.out.println(computeAveragePerimeter(objects));
	}
	//OO (good) way of performing computation
	public static double computeAveragePerimeter(List<ClosedCurve> objects) {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum/objects.size();
	}

}
