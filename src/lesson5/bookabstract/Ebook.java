package lesson5.bookabstract;
 // Inheritance
public class Ebook extends Book{
	private String etype;
	/*Ebook(){
		super("dafault","default",0.0);
	}*/
	public Ebook(String title,String authour,double price,String etype){
		// Invoke Parent class Constructor using super
		super(title, authour,price);
		this.etype = etype;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	
	@Override
	public String toString() {
		String res = super.toString();
		return res + " Ebook [etype=" + etype + "]";
	}
	@Override
	public void read() {
		System.out.println("Read using Electronic devices");

	}
	@Override
	public void turning() {
		System.out.println("Use Swipe or Keypad arrows");

	}
	

}
