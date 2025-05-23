package lesson12.error;

import java.util.Random;

class MyClass {
	public static void main(String[] args) {
	  new MyClass();
	}
	MyClass() {
	  recurse("Hello");
	}
	String recurse(String s) {
	  if (s == null)
	     return null;
	  int r = new Random().nextInt();
	  int n = s.length();
	  if (r % 2 == 0)
	    return recurse(s.substring(0, n / 2));
	  else {
	    return recurse(s.substring(n / 2, n));
	  }
	}
}