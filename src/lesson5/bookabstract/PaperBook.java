package lesson5.bookabstract;

public class PaperBook extends Book{
   private boolean color; 
	public PaperBook(String title, String authour, double price,boolean color) {
		super(title, authour, price);
		this.color = color;
	}
	@Override
	public String toString() {
		String res = super.toString();
		return res + " Paperbook [color =" + color + "]";
	}
	@Override
	public void read() {
		System.out.println("Read manually offline");
		
	}
	@Override
	public void turning() {
		System.out.println("Use hands to turn");
		
	}
	
}
