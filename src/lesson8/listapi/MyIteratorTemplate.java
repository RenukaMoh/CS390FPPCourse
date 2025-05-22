package lesson8.listapi;

import java.util.Iterator;

// 1. Implements Iterable interface
public class MyIteratorTemplate implements Iterable{

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator();
	}
	
	class MyIterator implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
