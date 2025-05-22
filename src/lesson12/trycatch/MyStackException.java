package lesson12.trycatch;

public class MyStackException extends Exception{
	
	public MyStackException() {
		super();
	}
	public MyStackException(String msg) {
		super("Empty Stack cannot be accessed");
		
	}
	public MyStackException(int index) {
		super(index + " not be negative");
	}
}
