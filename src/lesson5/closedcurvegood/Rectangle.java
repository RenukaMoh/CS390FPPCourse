package lesson5.closedcurvegood;

public class Rectangle extends ClosedCurve {
	private int length;
	private int height;
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return length * height;
	}

}
