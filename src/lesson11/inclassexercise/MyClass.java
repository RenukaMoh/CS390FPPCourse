package lesson11.inclassexercise;

public class MyClass {
	private int val;
	public MyClass(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	@Override
	public int hashCode() {
		return 2;
	}
	@Override
	public String toString() {
		return "MyClass object #" + val;
	}
	
	public static void main(String[] args) {
		
		MyHashtable hashtable = new MyHashtable();
		for(int i = 0; i< 9; ++i) {		
			hashtable.put(new MyClass(i), i);
		}
		hashtable.printTable();
	}
	
}
