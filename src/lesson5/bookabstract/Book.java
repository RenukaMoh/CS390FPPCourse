package lesson5.bookabstract;

/* 1.Abstract class can have instance fields, implemented methods, 
 * abstract methods
  2. Cannot create an object for Abstract class
  3. Don't make abstract class constructor as private
  4. Abstract method means nobody must implement in sub class
  5. Abstract method should not be private
*/
 public abstract class Book {
	 // Instance fields
	private String title;
	private String authour;
	private double price;
	public  Book(String title, String authour, double price ){
		this.title = title;
		this.authour = authour;
		this.price =price;
	}
	/*public Book(){
	}*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", authour=" + authour + ", price=" + price + "]";
	}
	// All abstract methods should implement inside Subclass
	// 1. Use the keyword Abstract
	//2. Don't provide implementation / method with nobody
	// 3. You have read behavior with the signature, what to do, provide abstraction
	abstract public void read();
	abstract public void turning();
	//abstract void test();
}
